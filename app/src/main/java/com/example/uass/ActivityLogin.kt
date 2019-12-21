package com.example.uass

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityLogin: AppCompatActivity() {
    lateinit var btnlogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnlogin = findViewById(R.id.tombol_logi)

        btnlogin.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
