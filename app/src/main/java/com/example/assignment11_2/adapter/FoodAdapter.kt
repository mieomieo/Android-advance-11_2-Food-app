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

    val foodList = listOf(
        Food(
            id = 1,
            name = "Hamburger  testcase long text",
            description = "Delicious hamburger with beef patty, lettuce, tomato, and cheese",
            price = 5545499.3,
            image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRrt1EInzip1NZ71yE0yKJ99ZtDqzzO-7iqtw&s"
        ),
        Food(
            id = 2,
            name = "Pizza",
            description = "Tasty pizza topped with pepperoni, mushrooms, and mozzarella cheese",
            price = 8343443.99,
            image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTFESPeeQZO1U-pTrKDWKPjrF5zYvEFARa2Vg&s"
        ),
        Food(
            id = 3,
            name = "Sushi",
            description = "Fresh sushi rolls with salmon, avocado, and cucumber",
            price = 1235.99,
            image = "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lounwyboavrk9d"
        ),
        Food(
            id = 4,
            name = "Sushi",
            description = "Fresh sushi rolls with salmon, avocado, and cucumber",
            price = 12040.99,
            image = "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lounwyboavrk9d"
        ),
        Food(
            id = 5,
            name = "Sushi",
            description = "Fresh sushi rolls with salmon, avocado, and cucumber",
            price = 124554.99,
            image = "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lounwyboavrk9d"
        ),
        Food(
            id = 6,
            name = "Sushi",
            description = "Fresh sushi rolls with salmon, avocado, and cucumber",
            price = 1245124.99,
            image = "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lounwyboavrk9d"
        ),
        Food(
            id = 7,
            name = "Sushi",
            description = "Fresh sushi rolls with salmon, avocado, and cucumber",
            price = 123125.99,
            image = "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lounwyboavrk9d"
        ),
        Food(
            id = 8,
            name = "Sushi",
            description = "Fresh sushi rolls with salmon, avocado, and cucumber",
            price = 12235.99,
            image = "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lounwyboavrk9d"
        ),
        Food(
            id = 9,
            name = "Sushi",
            description = "Fresh sushi rolls with salmon, avocado, and cucumber",
            price = 12235325.99,
            image = "https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-lounwyboavrk9d"
        ),


    )
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