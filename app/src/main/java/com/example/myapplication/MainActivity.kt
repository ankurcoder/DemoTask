package com.example.myapplication

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.data.db.UserDatabase
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.repository.Repository
import com.example.myapplication.utils.Constants
import com.example.myapplication.viewmodel.UserViewModel
import com.example.myapplication.viewmodel.UserViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

     lateinit var userViewModel:UserViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userDatabase = UserDatabase.getInstance(this)
        val repository = Repository(userDatabase)
        val viewModelFactory = UserViewModelFactory(repository)

        userViewModel = ViewModelProvider(this,viewModelFactory).get(UserViewModel::class.java)
        //hjvchgchgcghhj


    }


}
