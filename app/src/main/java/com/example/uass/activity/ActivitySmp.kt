package com.example.uass.activity

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.uass.MainActivity
import com.example.uass.R

@Suppress("DEPRECATED_IDENTITY_EQUALS")
class ActivitySmp : AppCompatActivity() {
    lateinit var tombol1: Button
    lateinit var tombol2: Button
    lateinit var tombol3: Button
    lateinit var tombol4: Button
    lateinit var tombol5: Button
    lateinit var tombol6: Button
    lateinit var tombol7: Button
    lateinit var tombol8: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smp)

        tampilSpiner()

        fungsiButton()
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.optionmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.getItemId() === R.id.about) {
            startActivity(Intent(this, Abaut::class.java))
            finish()
        } else if (item.getItemId() === R.id.setting) {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        } else if (item.getItemId() === R.id.help) {
            startActivity(Intent(this, ActivityDaftar::class.java))
            finish()
        }
        return true
    }

    private fun fungsiButton() {
        tombol1 = findViewById(R.id.btn_agama_smp)
        tombol2 = findViewById(R.id.btn_bindo_smp)
        tombol3 = findViewById(R.id.btn_ipa_smp)
        tombol4 = findViewById(R.id.btn_ips_smp)
        tombol5 = findViewById(R.id.btn_mtk_smp)
        tombol6 = findViewById(R.id.btn_penjas_smp)
        tombol7 = findViewById(R.id.btn_pkn_smp)
        tombol8 = findViewById(R.id.btn_bahasajawa_smp)


        tombol1.setOnClickListener {
            startActivity(Intent(this, ActivityMataPelajaran::class.java))
        }

        tombol2.setOnClickListener {
            startActivity(Intent(this, ActivityMataPelajaran::class.java))
        }
        tombol3.setOnClickListener {
            startActivity(Intent(this, ActivityMataPelajaran::class.java))
        }
        tombol4.setOnClickListener {
            startActivity(Intent(this, ActivityMataPelajaran::class.java))
        }
        tombol5.setOnClickListener {
            startActivity(Intent(this, ActivityMataPelajaran::class.java))
        }
        tombol6.setOnClickListener {
            startActivity(Intent(this, ActivityMataPelajaran::class.java))
        }
        tombol7.setOnClickListener {
            startActivity(Intent(this, ActivityMataPelajaran::class.java))
        }
        tombol8.setOnClickListener {
            startActivity(Intent(this, ActivityMataPelajaran::class.java))
        }
    }



    private fun tampilSpiner() {

        val languages = resources.getStringArray(R.array.Kelas_SMP)
        val spinner = findViewById<Spinner>(R.id.spinersmp)
        if (spinner != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, languages)
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@ActivitySmp,
                        getString(R.string.selected_item) + " " +
                                "" + languages[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }
    }
}