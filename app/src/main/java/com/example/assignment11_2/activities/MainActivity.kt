package com.example.assignment11_2.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.assignment10.R
import com.example.assignment10.databinding.ActivityMainBinding
import com.example.assignment11_2.adapter.FoodAdapter
import com.example.assignment11_2.model.Food
import com.example.assignment11_2.viewmodel.FoodViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val foodViewModel: FoodViewModel by lazy {
        ViewModelProvider(
            this,
            FoodViewModel.FoodViewModelFactory(this.application)
        )[FoodViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // RecyclerView
        val adapter = FoodAdapter()
        binding.rvFoods.layoutManager = GridLayoutManager(this,1)
        binding.rvFoods.adapter = adapter


    }


}