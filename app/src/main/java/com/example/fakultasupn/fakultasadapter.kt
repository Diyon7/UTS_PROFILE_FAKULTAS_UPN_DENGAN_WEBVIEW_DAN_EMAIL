package com.example.fakultasupn

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_fakultas.view.*

class fakultasadapter (val itemFac: List<fakultasdata>, val clickListener: (fakultasdata) -> Unit) :
RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_fakultas, parent, false)
        return PartViewHolder(view)
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(itemFac[position], clickListener)
    }
    override fun getItemCount() = itemFac.size
    class PartViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(data : fakultasdata, clickListener: (fakultasdata) -> Unit) {
            itemView.image_fak.setImageResource(data.imgFak)
            itemView.list_fak.text = data.namaFak
            itemView.setOnClickListener { clickListener(data) }
        }
    }
}