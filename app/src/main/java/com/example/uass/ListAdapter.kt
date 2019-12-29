package com.example.uass

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import bersatu.kita.part11.Model.Pelajaran
import com.bumptech.glide.Glide
import com.example.uass.activity.ActivityMataPelajaran
import kotlinx.android.synthetic.main.detailstudy.view.*
import kotlinx.android.synthetic.main.nav_header_main.view.*

class ListAdapter(
    var pelajaran: ArrayList<Pelajaran>,
    activityMataPelajaran: ActivityMataPelajaran
) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    fun updatePhotos(newPhotos: List<Pelajaran>) {
        pelajaran.clear()
        pelajaran.addAll(newPhotos)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int) =
        ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.detailstudy, parent, false)
        )

    override fun getItemCount() = pelajaran.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(pelajaran[position])
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(pelajaran: Pelajaran) {
            itemView.text_Judul_detail_study.text = pelajaran.title
            itemView.text_detail_studi.text = pelajaran.detail
            itemView.setOnClickListener { view ->
                Toast.makeText(itemView.context,"Hello",Toast.LENGTH_LONG).show()
            }
            //Glide.with(itemView.context).load(pelajaran.gambar).into(itemView.imageView)

        }
    }
}
