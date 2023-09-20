package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.myprojectandroind.R

class countActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)
        val labelAngka:TextView=(findViewById(R.id.labelAngka))
        val btnCount:Button=(findViewById(R.id.btnCount))
        val btnMinus:Button=(findViewById(R.id.btnMinus))
        val btnReset:Button=(findViewById(R.id.btnReset))

        //labelAngka.text="100"
        Log.d("Number","Hasilnya: ${labelAngka.text}")

        //action
        btnCount.setOnClickListener {
            //bikin variabel nilainya berubah
            //ambil text lalu konversi dari string ke Integer
            var countInteger:Int=labelAngka.text.toString().toInt()
            countInteger++

            //set Text
            labelAngka.text=countInteger.toString()


        }
        btnMinus.setOnClickListener {
            var minus:Int=labelAngka.text.toString().toInt()
            minus--

            labelAngka.text=minus.toString()
        }

        btnReset.setOnClickListener {
            labelAngka.text="0"
        }
    }
}