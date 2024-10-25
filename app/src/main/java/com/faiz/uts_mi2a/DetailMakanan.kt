package com.faiz.uts_mi2a

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailMakanan : AppCompatActivity() {

    private lateinit var imgDetailMakanan: ImageView
    private lateinit var txtDetailMakanan: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_makanan)

        imgDetailMakanan = findViewById(R.id.imgDetailMakanan)
        txtDetailMakanan = findViewById(R.id.txtDetailMakanan)

        val detailImg = intent.getIntExtra("gambar",0)
        val detailTeks = intent.getStringExtra("judul")

        imgDetailMakanan.setImageResource(detailImg)
        txtDetailMakanan.setText(detailTeks)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}