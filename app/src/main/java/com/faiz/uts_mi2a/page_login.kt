package com.faiz.uts_mi2a

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page_login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_login)
        val ActButton2 = findViewById<TextView>(R.id.txtsign)
        ActButton2.setOnClickListener {
            val Intent = Intent(this, page_account::class.java)
            startActivity(Intent)
        }
        val buttonLogin = findViewById<Button>(R.id.btnlogin)
        buttonLogin.setOnClickListener {
            // Intent untuk pindah ke halaman LoginPage
            val intent = Intent(this, makanan ::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}