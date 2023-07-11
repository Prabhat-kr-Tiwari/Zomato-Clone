package com.example.zomato.model

data class Availability(
    val nextCloseMessage: String,
    val nextOpenMessage: String,
    val opened: Boolean
)