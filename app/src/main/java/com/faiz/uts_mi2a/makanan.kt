package com.faiz.uts_mi2a

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.faiz.uts_mi2a.Adapter.makananAdapter
import com.faiz.uts_mi2a.Model.Mocklist1
import com.faiz.uts_mi2a.Model.modelMakanan

class makanan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_makanan)
        val makanan : RecyclerView = findViewById(R.id.makanan)

        makanan.layoutManager = GridLayoutManager(this,2)
        val adapter = makananAdapter(Mocklist1.getmodel()as ArrayList<modelMakanan>,this)
        makanan.adapter=adapter
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}