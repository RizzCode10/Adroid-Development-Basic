package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.myprojectandroind.R

class CalculatorActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        val ank1:TextView=(findViewById(R.id.ank1))
        val ank2:TextView=(findViewById(R.id.ank2))
        val inputAnk1:EditText=(findViewById(R.id.inputank1))
        val inputAnk2:EditText=(findViewById(R.id.inputAnk2))
        val btnPlus:Button=(findViewById(R.id.btnPlus))
        val btnMinus:Button=(findViewById(R.id.btnMinus))
        val btnPersen:Button=(findViewById(R.id.btnPersen))
        val btnKali:Button=(findViewById(R.id.btnKali))
        val btnBagi:Button=(findViewById(R.id.btnBagi))
        val btnClear:Button=(findViewById(R.id.btnClear))
        val labelAngka:TextView=(findViewById(R.id.labelAngka))

        val builder:AlertDialog.Builder = AlertDialog.Builder(this@CalculatorActivity)

        btnPlus.setOnClickListener {
            var angka1:Int=inputAnk1.text.toString().toInt()
            var angka2:Int=inputAnk2.text.toString().toInt()

            var hasil = angka1+angka2

            labelAngka.text=hasil.toString()


        }
        btnMinus.setOnClickListener {
            var angka1:Int=inputAnk1.text.toString().toInt()
            var angka2:Int=inputAnk2.text.toString().toInt()

            var hasil = angka1-angka2

            labelAngka.text=hasil.toString()


        }
        btnPersen.setOnClickListener {


            var hasil = inputAnk1.text.toString().toInt() % inputAnk2.text.toString().toInt()

            labelAngka.text=hasil.toString()


        }
        btnKali.setOnClickListener {
            var angka1:Int=inputAnk1.text.toString().toInt()
            var angka2:Int=inputAnk2.text.toString().toInt()

            var hasil = angka1*angka2

            labelAngka.text=hasil.toString()


        }
        btnBagi.setOnClickListener {
            var angka1:Int=inputAnk1.text.toString().toInt()
            var angka2:Int=inputAnk2.text.toString().toInt()

            var hasil = angka1/angka2

            labelAngka.text=hasil.toString()


        }
        btnClear.setOnClickListener {

            builder.setTitle("Perhatian !")
            builder.setMessage("Kamu yakin ingin menghapus semua data?")
            builder.setCancelable(false)
            //Buat Tombol Yes
            builder.setPositiveButton("Yes",{dialog, which ->

                inputAnk1.setText("")
                inputAnk2.setText("")
                labelAngka.text="0"
            })

            //Buat Tombol No
            builder.setNegativeButton("No",{dialog, wich ->})
            builder.setIcon(R.drawable.info)
            //Agar Builder kita dibuat harus panggil fungsi builder.create(
            val alertDialog:AlertDialog=builder.create()
            //Tampilkan Alert Kita
            alertDialog.show()




        }



    }
}