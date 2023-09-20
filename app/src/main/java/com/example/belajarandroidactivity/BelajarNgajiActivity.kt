package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.LanguageAdapter2
import com.example.belajarandroidactivity.model.Language2
import com.example.myprojectandroind.R

class BelajarNgajiActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_ngaji)

        val rvBahasaPemrograman: RecyclerView =
            findViewById(R.id.rvbahasaPemrograman1)
        val data = arrayListOf<Language2>(
            Language2("Dzikir & Doa Sunnah \nSetelah Shalat", R.drawable.doa_harian2),
            Language2("Dzikir Harian", R.drawable.doa_makan),
            Language2("Dzikir Setiap Saat", R.drawable.doa),
            Language2("Dzikir Pagi dan Petang ", R.drawable.doa_harian2),
            Language2("Dzikir & Doa Sunnah \nSetelah Shalat", R.drawable.doa_makan),
            Language2("Dzikir Pagi dan Petang ", R.drawable.doa),


            )
        val cvselengkapnya:CardView=findViewById(R.id.tblselengkapnya)


        cvselengkapnya.setOnClickListener{
            val Intent = Intent(this,DoaHarian::class.java)
            startActivity(Intent)
        }
        val adapter= LanguageAdapter2(data)

        rvBahasaPemrograman.adapter=adapter
        rvBahasaPemrograman.layoutManager=
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
    }





    }



