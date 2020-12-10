package com.example.restaurantpicker.data.users

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val address: String,
    val phoneNumber: String,
    val email: String
)


//Name
//• Profile pic
//• Address
//• Phone number
//• Email
//• List of Favourites restaurants