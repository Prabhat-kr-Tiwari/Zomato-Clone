package com.example.zomato.model

data class ZomatoData(
    val CAROUSEL_IMG_URL: String,
    val FETCH_MENU_URL: String,
    val FOODITEM_IMG_URL: String,
    val IMG_CDN_URL: String,
    val restaurantList: List<Restaurant>
)