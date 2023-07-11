package com.example.zomato.model

data class AggregatedDiscountInfo(
    val descriptionList: List<Description>,
    val header: String,
    val headerType: Int,
    val shortDescriptionList: List<ShortDescription>,
    val subHeader: String,
    val superFreedel: String
)