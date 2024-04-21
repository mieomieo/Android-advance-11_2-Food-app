package com.example.assignment11_2.repository

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.assignment11_2.database.FoodDatabase
import com.example.assignment11_2.database.dao.FoodDao
import com.example.assignment11_2.model.Food

class FoodRepository(app : Application) {
    private val foodDao : FoodDao

    init{
        val foodDatabase: FoodDatabase = FoodDatabase.getInstance(app)
        foodDao = foodDatabase.getFoodDao()
    }

    suspend fun insertFood(food: Food) = foodDao.insertFood(food)
    suspend fun updateFood(food: Food) = foodDao.updateFood(food)
    suspend fun deleteFood(id : Int) = foodDao.deleteFood(id)

    fun getAllFood():LiveData<List<Food>> = foodDao.getAllFoods()


}