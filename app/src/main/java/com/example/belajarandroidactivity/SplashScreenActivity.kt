package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.myprojectandroind.R

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

//        Panggil object Handler dari package os
        Handler().postDelayed({
            val intent = Intent(this, BelajarNgajiActivity::class.java)
            startActivity(intent)
        },4000)
    }
}