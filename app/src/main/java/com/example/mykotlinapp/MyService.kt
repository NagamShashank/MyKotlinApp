package com.example.mykotlinapp

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings
import android.util.Log

class MyService: Service() {

    private lateinit var Mplayer : MediaPlayer

    override fun onBind(intent: Intent?): IBinder? {
        Log.e("MY SERVICE","This is onBind")
       return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        Log.e("MY SERVICE","This is onStartCommand")

        Mplayer = MediaPlayer.create(this,Settings.System.DEFAULT_RINGTONE_URI)
        Mplayer.isLooping = true
        Mplayer.start()
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("MY SERVICE","This is onDestroy")
        Mplayer.stop()
    }

    override fun onUnbind(intent: Intent?): Boolean {
        Log.e("MY SERVICE","This is onUnbind")
        return super.onUnbind(intent)
    }

    override fun onRebind(intent: Intent?) {
        Log.e("MY SERVICE","This is onRebind")
        super.onRebind(intent)
    }

}