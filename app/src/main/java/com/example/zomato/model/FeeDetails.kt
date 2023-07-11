package com.example.zomato.model

data class FeeDetails(
    val amount: String,
    val fees: List<Fee>,
    val icon: String,
    val message: String,
    val title: String,
    val totalFees: Int
)