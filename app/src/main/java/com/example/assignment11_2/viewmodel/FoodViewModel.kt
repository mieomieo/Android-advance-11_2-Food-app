package com.example.assignment11_2.viewmodel

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.assignment11_2.model.Food
import com.example.assignment11_2.repository.FoodRepository
import kotlinx.coroutines.launch
import java.lang.IllegalArgumentException

class FoodViewModel (app : Application):ViewModel(){
    private val foodRepository : FoodRepository = FoodRepository(app)
    class FoodViewModelFactory(private val application: Application) :
        ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(FoodViewModel::class.java)) {
                return FoodViewModel(application) as T
            }
            throw IllegalArgumentException("Unable construct viewModel")
        }
    }
    fun insertFood(food: Food) = viewModelScope.launch {
        foodRepository.insertFood(food)
    }
    fun updateFood(food: Food)=viewModelScope.launch {
        foodRepository.updateFood(food)
    }
    fun deleteFood(id:Int)=viewModelScope.launch {
        foodRepository.deleteFood(id)

    }
    fun getAllFoods():LiveData<List<Food>> = foodRepository.getAllFood()
}