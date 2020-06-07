package com.example.novenasemana.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.novenasemana.db.entity.AutoEntity

@Dao
interface AutoDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertAuto(auto: AutoEntity)

}

