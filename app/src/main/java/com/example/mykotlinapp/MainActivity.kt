package com.example.mykotlinapp

import android.Manifest
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.mykotlinapp.databinding.ActivityMainBinding
import com.karumi.dexter.Dexter
import com.karumi.dexter.DexterBuilder.MultiPermissionListener
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {
            StartButton.setOnClickListener {
                getpermission()
            }
        }

//
//        Log.e("MY SERVICE","This is onCreate")
//        binding.StartButton.setOnClickListener(View.OnClickListener {
//            startService(Intent(this,MyService::class.java))
//        })
//
//        binding.StopButton.setOnClickListener(View.OnClickListener {
//            stopService(Intent(this,MyService::class.java))
//        })

        //Runtime Permissions using Dexter Library


//        binding.StartButton.setOnClickListener {
//            getpermission()
//        }


    }

    private fun getpermission() {
        Dexter.withContext(this)
            .withPermissions(Manifest.permission.CAMERA, Manifest.permission.READ_CONTACTS)
            .withListener(object : MultiplePermissionsListener{
                override fun onPermissionsChecked(report: MultiplePermissionsReport?) {
                    report.let {
                        if (report != null) {
                            if(report.areAllPermissionsGranted()){
                                Toast.makeText(applicationContext,"All Permissions",Toast.LENGTH_SHORT).show()
                            }else{
                                Toast.makeText(applicationContext,"Permissions Denied",Toast.LENGTH_SHORT).show()
                            }
                        }

                    }
                }

                override fun onPermissionRationaleShouldBeShown(permissions: MutableList<PermissionRequest>?, token: PermissionToken?) {
                    token?.continuePermissionRequest()
                }
            }).withErrorListener{
                Toast.makeText(applicationContext,it.name,Toast.LENGTH_SHORT).show()
                }.check()

    }


}










/*
 override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }*/

/* receiver = MyAirplaneMode()
 IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
     registerReceiver(receiver,it)
 } */

//private lateinit var receiver : MyAirplaneMode