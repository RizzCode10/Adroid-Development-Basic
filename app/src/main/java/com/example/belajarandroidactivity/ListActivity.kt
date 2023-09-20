package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.myprojectandroind.R

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
//        define Array adapter
        val arrayAdapter:ArrayAdapter<*>
        val users= arrayOf("Virial Kohil","Rohit Sharma","Steve Smith",
        "Kane Williamson", "Rose Taylor")
//        Deklarasikan Variabel List
        var mListView:ListView=findViewById(R.id.lvNama)
        arrayAdapter=ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            users
            )
//      isi Adapter
        mListView.adapter=arrayAdapter
    }
}