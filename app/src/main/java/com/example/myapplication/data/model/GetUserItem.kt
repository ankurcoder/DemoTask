package com.example.myapplication.data.model

import androidx.room.Entity
import java.io.Serializable

@Entity(tableName = "users")
data class GetUserItem(
    val accountId: String,
    val carrier: String,
    val dob: String,
    val expirationDate: String,
    val firstName: String,
    val id: String,
    val lastName: String,
    val licenseNumber: String,
    val state: String,
    val status: String
):Serializable