package com.example.zomato.model

data class AggregatedDiscountInfoV2(
    val descriptionList: List<Description>,
    val header: String,
    val headerType: Int,
    val shortDescriptionList: List<ShortDescription>,
    val subHeader: String,
    val superFreedel: String
)