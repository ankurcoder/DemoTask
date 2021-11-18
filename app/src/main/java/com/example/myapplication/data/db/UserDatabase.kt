package com.example.myapplication.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.myapplication.data.model.GetUserItem

@Database(entities = [GetUserItem::class], version = 1, exportSchema = false)
abstract class UserDatabase: RoomDatabase() {
        abstract fun getUserDao():RoomDao

        companion object{
            @Volatile
            private var INSTANCE:UserDatabase? = null

            fun getInstance( context: Context) : UserDatabase{
                synchronized(this){
                    var instance = INSTANCE
                    if(instance == null ){
                        instance = Room.databaseBuilder(
                            context.applicationContext,
                            UserDatabase::class.java,
                            "users_database"
                        ).fallbackToDestructiveMigration().build()
                        INSTANCE = instance
                    }
                    return instance
                }
            }
        }
}