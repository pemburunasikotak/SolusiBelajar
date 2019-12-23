package com.example.uass

import android.content.Intent
import android.os.Bundle
import androidx.navigation.ui.AppBarConfiguration
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uass.activity.ActivitySd
import com.example.uass.activity.ActivitySma
import com.example.uass.activity.ActivitySmp
import com.example.uass.activity.ActivityTk
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var btntk: Button
    private lateinit var btnsd: Button
    private lateinit var btnsmp: Button
    private lateinit var btnsma: Button
    private lateinit var rvHeroes: RecyclerView
    private var title = "Mode List"
    private val list = ArrayList<Pelajaran>()

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        btntk = findViewById(R.id.btnTk)
        btnsd = findViewById(R.id.btnSD)
        btnsmp = findViewById(R.id.btnSMP)
        btnsma = findViewById(R.id.btnSMA)

        btntk.setOnClickListener {
            startActivity(Intent(this, ActivityTk::class.java))
        }

        btnsd.setOnClickListener {
            startActivity(Intent(this, ActivitySd::class.java))
        }
        btnsmp.setOnClickListener {
            startActivity(Intent(this, ActivitySmp::class.java))
        }
        btnsma.setOnClickListener {
            startActivity(Intent(this, ActivitySma::class.java))
        }
    }
}
