package com.example.assignment11_2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.assignment10.R
import com.example.assignment10.databinding.FoodItemBinding
import com.example.assignment11_2.model.Food
import java.text.NumberFormat
import java.util.Locale

class FoodAdapter : RecyclerView.Adapter<FoodAdapter.ViewHolder>() {

    private var foodList = emptyList<Food>()

    inner class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding: FoodItemBinding = FoodItemBinding.bind(item)
        val foodName = binding.tvFoodName
        val foodPrice = binding.tvFoodPrice
        val foodDescription = binding.tvFoodDescription
        val foodImage = binding.imgFood

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.food_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodAdapter.ViewHolder, position: Int) {
        holder.foodName.text = foodList[position].name
        holder.foodPrice.text = NumberFormat.getCurrencyInstance(Locale("vi", "VN")).format(foodList[position].price)
        holder.foodDescription.text = foodList[position].description
        Glide.with(holder.itemView.context).load(foodList[position].image)
            .error(R.drawable.img_no_available).into(holder.foodImage)

    }

    override fun getItemCount(): Int {
        return foodList.size
    }

}