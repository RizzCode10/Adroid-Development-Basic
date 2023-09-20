package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.myprojectandroind.R
import jp.wasabeef.glide.transformations.BlurTransformation

class Belajar_ScrollViewActivity : AppCompatActivity() {
    var ivbacground:ImageView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_scroll_view)

        ivbacground = findViewById(R.id.ivBookPic2)

        Glide.with(this)
            .load(R.drawable.godzilla)
            .transform(BlurTransformation(25,3))
            .into(ivbacground!!)
    }
}