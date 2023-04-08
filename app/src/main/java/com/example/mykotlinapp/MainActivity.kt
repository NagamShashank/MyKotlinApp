package com.example.mykotlinapp

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.mykotlinapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Log.e("MY SERVICE","This is onCreate")

        binding.StartButton.setOnClickListener(View.OnClickListener {
            startService(Intent(this,MyService::class.java))
        })

        binding.StopButton.setOnClickListener(View.OnClickListener {
            stopService(Intent(this,MyService::class.java))
        })

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