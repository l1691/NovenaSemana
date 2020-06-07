package com.example.novenasemana.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.novenasemana.db.AppRoomDatabase
import com.example.novenasemana.db.entity.AutoEntity
import com.example.novenasemana.repository.AutoRepository

class AutoViewModel(application: Application):AndroidViewModel(application){

    private val autoRepo:AutoRepository

    init {
        val autoDao = AppRoomDatabase.getDatabase(application).autoDao()
        autoRepo = AutoRepository(autoDao)
    }

    fun insertAuto(auto:AutoEntity) = autoRepo.insertAuto(auto)
}