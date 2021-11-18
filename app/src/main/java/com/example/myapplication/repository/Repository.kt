package com.example.myapplication.repository

import com.example.myapplication.data.RetrofitInstance
import com.example.myapplication.data.db.UserDatabase
import com.example.myapplication.data.model.GetUserItem

class Repository(val db:UserDatabase) {
    suspend fun getAllUsers() = RetrofitInstance.api.getUsers()
    suspend fun insert(users:GetUserItem) = db.getUserDao().insert(users)
    suspend fun getSavedUsers(users:GetUserItem) = db.getUserDao().getUsers()
}