package com.example.recyclerview

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.MainAdapter.MyAdapter

class MainActivity : AppCompatActivity() {
    private var titleList = mutableListOf<String>()
    private var descList = mutableListOf<String>()
    private val write = mutableListOf<String>()
    private var imageList = mutableListOf<Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Mengisi data ke daftar judul, deskripsi, dan gambar
        titleList.add("Item 1")
        descList.add("Deskripsi Item 1")
        write.add("Baca Selengkapnya")
        imageList.add(R.drawable.gsatu)


        titleList.add("Item 2")
        descList.add("Deskripsi Item 2")
        write.add("Baca Selengkapnya")
        imageList.add(R.drawable.gdua)

        titleList.add("Item 3")
        descList .add ("Deskripsi Item 3")
        write.add("Baca Selengkapnya")
        imageList.add(R.drawable.gtiga)

        titleList.add("Item 4")
        descList.add("Deskripsi Item 4")
        write.add("Baca Selengkapnya")
        imageList.add(R.drawable.gempat)

        titleList.add("Item 5")
        descList.add("Deskripsi Item 5")
        write.add("Baca Selengkapnya")
        imageList.add(R.drawable.glima)


        // Menginisialisasi RecyclerView pertama
        val recyclerView: RecyclerView = findViewById(R.id.rcview)
        val adapter = MyAdapter(titleList, descList, imageList, write )
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = adapter

    }
}
