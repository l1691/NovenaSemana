package com.example.novenasemana.repository

import com.example.novenasemana.db.dao.AutoDao
import com.example.novenasemana.db.entity.AutoEntity

class AutoRepository (private val autoDao:AutoDao){
    fun insertAuto(auto:AutoEntity){
        autoDao.insertAuto(auto)
    }
}