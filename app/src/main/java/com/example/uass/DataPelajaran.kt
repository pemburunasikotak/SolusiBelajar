package com.example.uass

import bersatu.kita.part11.Model.Pelajaran

object DataPelajaran {

    private val heroNames = arrayOf("Ahmad Dahlan")
    private val heroDetails = arrayOf("Salah seorang ulama dan khatib terkemuka di Masjid Besar")
    private val heroImange = intArrayOf( R.drawable.logo)

    val listData: ArrayList<Pelajaran>
        get() {
            val list = arrayListOf<Pelajaran>()
            for (position in heroNames.indices) {
                val pelajaran = Pelajaran()
                pelajaran.title = heroNames[position]

                pelajaran.detail = heroDetails[position]
                pelajaran.gambar = heroImange[position].toString()
                list.add(pelajaran)
            }
            return list
        }
}