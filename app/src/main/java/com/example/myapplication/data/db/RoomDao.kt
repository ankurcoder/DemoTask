package com.example.myapplication.data.db

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.myapplication.data.model.GetUser
import com.example.myapplication.data.model.GetUserItem

interface RoomDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(user:GetUserItem):Long
    @Query("SELECT * FROM users")
    fun getUsers():LiveData<List<GetUserItem>>
}