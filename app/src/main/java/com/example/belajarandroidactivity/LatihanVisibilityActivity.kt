package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isGone
import androidx.core.view.isInvisible
import com.example.myprojectandroind.R

class LatihanVisibilityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_visibility)
        val tvText:TextView=findViewById(R.id.tvText)
        val btnClick:Button=findViewById(R.id.btnClick)


        btnClick.setOnClickListener {
            if(tvText.isInvisible) {
                tvText.visibility = View.VISIBLE
            }else{
                tvText.visibility = View.INVISIBLE
            }

        }
    }
}