package com.example.zomato.model

data class Sla(
    val deliveryTime: Int,
    val iconType: String,
    val lastMileDistance: Int,
    val lastMileTravel: Double,
    val longDistance: String,
    val maxDeliveryTime: Int,
    val minDeliveryTime: Int,
    val preferentialService: Boolean,
    val rainMode: String,
    val restaurantId: String,
    val serviceability: String
)