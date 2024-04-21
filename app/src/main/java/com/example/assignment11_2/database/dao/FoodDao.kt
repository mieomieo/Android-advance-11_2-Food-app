package com.example.assignment11_2.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.assignment11_2.model.Food

@Dao
interface FoodDao {
    @Insert
    suspend fun insertFood(food: Food)
    @Update
    suspend fun updateFood(food: Food)
    @Delete
    suspend fun deleteFood(id: Int)

    @Query("SELECT * FROM food_table")
     fun getAllFoods():LiveData<List<Food>>

    @Query("SELECT * FROM food_table WHERE name_col=:name")
    fun getFoodByName(name:String):LiveData<List<Food>>
}