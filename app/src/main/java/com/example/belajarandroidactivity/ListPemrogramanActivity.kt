package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.LanguageAdapter
import com.example.belajarandroidactivity.model.Language
import com.example.myprojectandroind.R

class ListPemrogramanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_pemrograman)
        val rvBahasaPemrograman:RecyclerView=
            findViewById(R.id.rvbahasaPemrograman)
        val data = arrayListOf<Language>(
            Language("Golang", R.drawable.golang),
            Language("C++", R.drawable.cplus),
            Language("Python", R.drawable.python),
            Language("Golang", R.drawable.golang),
            Language("C++", R.drawable.cplus),
            Language("Python", R.drawable.python),
            Language("Golang", R.drawable.golang),
            Language("C++", R.drawable.cplus),
            Language("Python", R.drawable.python),

        )
        val adapter=LanguageAdapter(data)

        rvBahasaPemrograman.adapter=adapter
        rvBahasaPemrograman.layoutManager=
            LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }
}