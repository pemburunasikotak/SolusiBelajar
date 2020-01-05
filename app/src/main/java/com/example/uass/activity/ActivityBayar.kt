package com.example.uass.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import com.example.uass.MainActivity
import com.example.uass.R
import kotlinx.android.synthetic.main.activity_bayar.*
import org.w3c.dom.Text

@Suppress("DEPRECATED_IDENTITY_EQUALS")
class ActivityBayar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bayar)


        if(btn_bayar.callOnClick()){
            if (edit_text_nama_bayar!==null){
                tv_isi_totalbayar.text= edit_text_nama_bayar.toString()
            }
            btn_bayar.setOnClickListener {
                startActivity(Intent(this, ActivitySoal::class.java))
                finish()
            }
        }
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


}
