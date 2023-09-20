package com.example.myprojectandroind

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageButton
import android.widget.ImageView

class openCameraActivity : AppCompatActivity() {

    var ibCamera:ImageButton?=null
    var ivISample:ImageView?=null
    var pic_id=123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_camera)

        ibCamera=findViewById(R.id.ibCamera)
        ivISample=findViewById(R.id.ivSample)



        ibCamera!!.setOnClickListener{
            val intent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent,pic_id)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==pic_id){
            val photo: Bitmap=data?.extras?.get("data") as Bitmap

            ivISample!!.setImageBitmap(photo)
        }
    }
}