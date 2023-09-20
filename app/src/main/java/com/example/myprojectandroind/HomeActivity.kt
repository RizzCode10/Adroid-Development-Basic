package com.example.myprojectandroind

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.button.MaterialButton

class HomeActivity : AppCompatActivity() {

    var btnOpen:MaterialButton?=null
    var btnShare:MaterialButton?=null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnOpen = findViewById(R.id.btnopen)
        btnShare = findViewById(R.id.btnShare)

        btnOpen!!.setOnClickListener{
            val intent = Intent(this,DetailActivity::class.java)
            startActivity(intent)
        }
        btnShare!!.setOnClickListener{
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT,"Saya pesan Cofee Latte!")
            intent.setType("text/plain")
            startActivity(Intent.createChooser(intent, "SHARE To:"))
        }

    }
}