package com.example.uass

object DataPelajaran {

    private val heroNames = arrayOf("Ahmad Dahlan")
    private val heroDetails = arrayOf("Salah seorang ulama dan khatib terkemuka di Masjid Besar")
    private val heroImange = intArrayOf( R.drawable.logo)

    val listData: ArrayList<Pelajaran>
        get() {
            val list = arrayListOf<Pelajaran>()
            for (position in heroNames.indices) {
                val hero = Pelajaran()
                hero.name = heroNames[position]
                hero.detail = heroDetails[position]
                hero.photo = heroImange[position]
                list.add(hero)
            }
            return list
        }
}