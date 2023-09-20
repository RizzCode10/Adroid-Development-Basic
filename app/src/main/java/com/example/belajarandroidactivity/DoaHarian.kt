package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DoaHarianAdapter
import com.example.belajarandroidactivity.model.DoaHarianModel

import com.example.myprojectandroind.R

class DoaHarian : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)
        val rvBahasaPemrograman3: RecyclerView =
            findViewById(R.id.rvbahasaPemrograman3)
        val data = arrayListOf<DoaHarianModel>(
            DoaHarianModel("Doa Setelah Bangun \nTidurt", "اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْر","Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru",),
            DoaHarianModel("Doa Sebelum Makan", "اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ","Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar",),
            DoaHarianModel("Doa Setelah Bangun \nTidurt", "اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْر","Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru",),
            DoaHarianModel("Doa Setelah Bangun \nTidurt", "اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْر","Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru",),
            DoaHarianModel("Doa Setelah Bangun \nTidurt", "اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْر","Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru",),



            )
        val adapter= DoaHarianAdapter(data)

        rvBahasaPemrograman3.adapter=adapter
        rvBahasaPemrograman3.layoutManager=
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        val btnback:ImageButton=findViewById(R.id.btnback)

        btnback.setOnClickListener{
            val Intent = Intent(this,BelajarNgajiActivity::class.java)
            startActivity(Intent)
        }
    }
}