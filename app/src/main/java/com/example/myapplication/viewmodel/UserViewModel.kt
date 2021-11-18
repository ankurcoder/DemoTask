package com.example.myapplication.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.repository.Repository
import kotlinx.coroutines.launch

class UserViewModel(val repository: Repository) : ViewModel() {

    init {

    }

    fun getUsers(){
        viewModelScope.launch {
                val response = repository.getAllUsers()
        }
    }
}