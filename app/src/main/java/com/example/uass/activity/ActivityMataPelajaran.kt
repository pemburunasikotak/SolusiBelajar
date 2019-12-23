package com.example.uass.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uass.CardViewHeroAdapter
import com.example.uass.DataPelajaran
import com.example.uass.Pelajaran
import com.example.uass.R
import java.util.ArrayList

class ActivityMataPelajaran: AppCompatActivity() {
    private lateinit var rvHeroes: RecyclerView
    private var title = "Mode List"
    private val list = ArrayList<Pelajaran>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matapejaran)
        rvHeroes = findViewById(R.id.recyleView)
        rvHeroes.setHasFixedSize(true)

        list.addAll(DataPelajaran.listData)
        showRecyclerCardView()

    }

    private fun showRecyclerCardView() {
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val cardViewHeroAdapter = CardViewHeroAdapter(list)
        rvHeroes.adapter = cardViewHeroAdapter
    }
}