package com.example.novenasemana.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.novenasemana.R
import com.example.novenasemana.db.entity.AutoEntity
import com.example.novenasemana.ui.adapters.AutoAdapter
import com.example.novenasemana.viewmodel.AutoViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var autoViewModel: AutoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = recyclerAutos as RecyclerView
        val adapter = AutoAdapter(this)
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this)

        autoViewModel = ViewModelProvider(this).get(AutoViewModel::class.java)
        autoViewModel.insertAuto(AutoEntity(brand = "TESLA",model = "MODEL 3",year = 2020))

        autoViewModel.autos.observe(this, Observer { autos ->
            autos?.let { adapter.setAutos(autos) }
        })

    }
}
