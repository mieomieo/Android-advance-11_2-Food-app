package com.example.assignment11_2.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.assignment11_2.database.dao.FoodDao
import com.example.assignment11_2.model.Food

@Database(entities = [Food::class], version = 1)
abstract class FoodDatabase : RoomDatabase() {
    abstract fun getFoodDao(): FoodDao
    companion object {
        @Volatile
        private var instance: FoodDatabase? = null
        fun getInstance(context: Context): FoodDatabase {
            if (instance == null) {
                instance =
                    Room.databaseBuilder(context, FoodDatabase::class.java, "FoodDatabase").build()
            }
            return instance!!
        }

    }
}