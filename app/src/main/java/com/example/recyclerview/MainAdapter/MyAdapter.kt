package com.example.recyclerview.MainAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R

class MyAdapter(private var titles: List<String>, private var details: List<String>, private var images: List<Int>, private var writes: List<String>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemTitle: TextView = itemView.findViewById(R.id.lydesc)
        val itemDetail: TextView = itemView.findViewById(R.id.details)
        val itempicture: ImageView = itemView.findViewById(R.id.gambarkonten)
        val itemwrite: TextView = itemView.findViewById(R.id.bacaselengkapnya)

        init {
            itemView.setOnClickListener { v: View ->
                val position: Int = adapterPosition
                Toast.makeText(itemView.context, "klik item  #${position + 1}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycleview, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemwrite.text = writes [position]
        holder.itempicture.setImageResource(images[position])
    }
}
