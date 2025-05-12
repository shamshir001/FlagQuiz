package com.techmania.flagquiz.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.techmania.flagquiz.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        Thread.sleep(3000L)
        setContentView(R.layout.activity_main)

    }
}