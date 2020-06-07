package com.example.novenasemana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.novenasemana.db.entity.AutoEntity
import com.example.novenasemana.viewmodel.AutoViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var autoViewModel: AutoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        autoViewModel = ViewModelProvider(this).get(AutoViewModel::class.java)

        autoViewModel.insertAuto(AutoEntity(brand = "TOYOTA",model = "YARIS",year = 2009))

    }
}
