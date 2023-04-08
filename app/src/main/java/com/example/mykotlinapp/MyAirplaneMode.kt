package com.example.mykotlinapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyAirplaneMode:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplaneModeEnabled = intent?.getBooleanExtra("state",false)?: return

        if(isAirplaneModeEnabled){
            Toast.makeText(context,"Airplane Mode On",Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(context,"Airplane Mode Off",Toast.LENGTH_SHORT).show()
        }
    }
}