package com.example.belajarandroidactivity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.model.Language2
import com.example.myprojectandroind.R

class LanguageAdapter2(val data:ArrayList<Language2>)
    : RecyclerView.Adapter<LanguageAdapter2.LanguageViewHolder>() {
    class LanguageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvBahasaPemrograman: TextView = view.findViewById(R.id.tvBahasaPemrograman1)
        val ivBahasaPemrograman: ImageView = view.findViewById(R.id.ivBahasaPemrograman1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_bahasa_pemrograman3, parent, false)
        return LanguageViewHolder(view)
    }

    override fun getItemCount(): Int = data.size
    //bisa juga pake syntax bawah :
    /*
        overide fun getItemCount(): Int{
            return data.size
        }
     */


    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        val item = data.get(position)

//        isi data dari model ke language masing-masing view
        holder.tvBahasaPemrograman.text=item.name
        holder.ivBahasaPemrograman.setImageResource(item.image)
    }
}