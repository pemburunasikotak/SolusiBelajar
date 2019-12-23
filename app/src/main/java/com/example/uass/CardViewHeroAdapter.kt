package com.example.uass

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.*

class CardViewHeroAdapter internal constructor(private val listHero: ArrayList<Pelajaran>) : RecyclerView.Adapter<CardViewHeroAdapter.CardViewViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.detailstudy, viewGroup, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val hero = listHero[position]

        Glide.with(holder.itemView.context)
            .load(hero.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.tvName.text = hero.name
        holder.tvDetail.text = hero.detail

    //    holder.btnFavorite.setOnClickListener { Toast.makeText(holder.itemView.context, "Favorite " + listHero[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }

      //  holder.btnShare.setOnClickListener { Toast.makeText(holder.itemView.context, "Share " + listHero[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }

        holder.itemView.setOnClickListener { Toast.makeText(holder.itemView.context, "Kamu memilih " + listHero[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
    }

    override fun getItemCount(): Int {
        return listHero.size
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.Image_detail_studi)
        var tvName: TextView = itemView.findViewById(R.id.text_Judul_detail_study)
        var tvDetail: TextView = itemView.findViewById(R.id.text_detail_studi)
        //var btnFavorite: Button = itemView.findViewById(R.id.btn_set_Fa)
        //var btnShare: Button = itemView.findViewById(R.id.btn_set_she)
    }
}