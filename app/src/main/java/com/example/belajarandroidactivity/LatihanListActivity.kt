package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.myprojectandroind.R

class LatihanListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_list)
        //        define Array adapter
        val arrayAdapter: ArrayAdapter<*>
        val users= arrayOf("Python","C#","C++",
            "JavaScrip", "PHP", "Swift", "Java", "Go", "SQL", "Ruby")
//        Deklarasikan Variabel List
        var mListView: ListView =findViewById(R.id.rvbahasaPemrograman)
        arrayAdapter= ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            users
        )
//      isi Adapter
        mListView.adapter=arrayAdapter
    }
}