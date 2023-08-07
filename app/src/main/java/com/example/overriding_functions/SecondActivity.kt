package com.example.overriding_functions

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlin.math.roundToInt
import java.util.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


    }
    override fun onDestroy() {
        super.onDestroy() //we want to stop the timer  when our service is destroyed
        Log.d("omaaaaaar", "secondactivitydestory")
    }
}