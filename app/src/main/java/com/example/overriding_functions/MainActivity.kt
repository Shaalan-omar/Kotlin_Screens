package com.example.overriding_functions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.overriding_functions.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("omaaaaaar","onCreate().toString()");
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) //I believe this is how we access the views
        binding.button.setOnClickListener(View.OnClickListener { startActivity(Intent(this, SecondActivity::class.java)) })



  }
    override fun onStart() {
        super.onStart()
        Log.d("omaaaaaar","onStart().toString()")

    }
    override fun onResume() {
        super.onResume() //we want to stop the timer  when our service is destroyed
        Log.d("omaaaaaar", "onResume().toString()")
    }
    override fun onPause() {
        super.onPause()
        Log.d("omaaaaaar","onPause().toString()")

    }
    override fun onStop() {
        super.onStop() //we want to stop the timer  when our service is destroyed
        Log.d("omaaaaaar", "onStop().toString()")
    }

    override fun onRestart() {
        super.onRestart() //we want to stop the timer  when our service is destroyed
        Log.d("omaaaaaar", "onRestart().toString()")
    }
    override fun onDestroy() {
        super.onDestroy() //we want to stop the timer  when our service is destroyed
        Log.d("Destroy", "onDestroy().toString()")
    }


}
