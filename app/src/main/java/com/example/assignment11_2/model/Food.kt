package com.example.assignment11_2.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "food_table")
class Food(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int? = 0,
    @ColumnInfo(name = "name_col")
    var name: String = "",
    @ColumnInfo(name = "description_col")
    var description: String = "",
    @ColumnInfo(name = "price_col")
    var price: Double,
    @ColumnInfo(name="image-col")
    val image: String

) : Parcelable