package com.example.uass.activity

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.uass.MainActivity
import com.example.uass.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detailpelajaran.*


class ActivityDetailPelajaran : AppCompatActivity() {

    private lateinit var tvData : TextView
    private lateinit var image : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailpelajaran)

        tampil()
        funtombol()
    }

    private fun funtombol() {
        btn_scroll_View.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    private fun tampil() {
        tvData = findViewById(R.id.tv_detail_Pelajaran)
        image = findViewById(R.id.image_detail_Pelajaran)

        tvData.setText(intent.getStringExtra("detail"))

        Picasso.get()
            .load(intent.getStringExtra("gambar"))
            .resize(500, 300)
            .centerCrop()
            .into(image)
    }
}