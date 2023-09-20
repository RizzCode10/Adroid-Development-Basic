package com.example.myprojectandroind

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.google.android.material.button.MaterialButton
import com.google.android.material.transition.MaterialArcMotion

class TravelActivity : AppCompatActivity() {
    var ibCall:ImageButton?=null
    var ibNav:ImageButton?=null
    var ibShare:ImageButton?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)
        ibCall=findViewById(R.id.ibcall)
        ibNav=findViewById(R.id.ibNav)
        ibShare=findViewById(R.id.ibShare)

        ibCall!!.setOnClickListener{
            val phoneNumber="025123122"
            val phoneintent = Intent(Intent.ACTION_DIAL, Uri.parse("tel: $phoneNumber"))

//            intent.putExtra(Intent.EXTRA_PHONE_NUMBER,"Saya pesan Cofee Latte!")
//            intent.setType("text/plain")
//            startActivity(Intent.createChooser(intent, "SHARE To:"))
            startActivity(phoneintent)
        }
        ibNav!!.setOnClickListener {
            val mapIntent=Intent(Intent.ACTION_VIEW, Uri.parse("geo: -6.71460785798222, 106.73371866488253"))
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        ibShare!!.setOnClickListener{
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT,"Saya pesan Cofee Latte!")
            intent.setType("text/plain")
            startActivity(Intent.createChooser(intent, "SHARE To:"))
        }
    }
}