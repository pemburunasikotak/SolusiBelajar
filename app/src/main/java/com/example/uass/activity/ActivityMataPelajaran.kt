package com.example.uass.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import bersatu.kita.part11.Model.Pelajaran
import com.example.uass.ListAdapter
import com.example.uass.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import java.util.*
import kotlin.collections.ArrayList


class ActivityMataPelajaran: AppCompatActivity() {
    private lateinit var rvData: RecyclerView
    private var title = "Mode List"
    private var list = ArrayList<Pelajaran>()
    private var requestAdapterRecyclerView: ListAdapter? = null
    private var database: DatabaseReference? = null

    private val fab_add: FloatingActionButton? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matapejaran)
        rvData = findViewById(R.id.recyleView)
        rvData.setHasFixedSize(true)


        showRecyclerCardView()

    }

    private fun showRecyclerCardView() {


        val cardViewHeroAdapter = ListAdapter(list,this)
        rvData.adapter = cardViewHeroAdapter
        rvData.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        var database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("mata_pelajaran")
        myRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) { // This method is called once with the initial value and again
// whenever data at this location is updated.
                val value = dataSnapshot.getValue(pelajaranholder::class.java)!!
                list.addAll(value.mata_pelajaran)
                cardViewHeroAdapter.notifyDataSetChanged()

            }

            override fun onCancelled(error: DatabaseError) { // Failed to read value

            }
        })}
    class pelajaranholder(var mata_pelajaran:ArrayList<Pelajaran>)
    }