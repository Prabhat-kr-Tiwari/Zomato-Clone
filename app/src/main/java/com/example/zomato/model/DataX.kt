package com.example.zomato.model

data class DataX(
    val adTrackingID: String,
    val address: String,
    val aggregatedDiscountInfo: AggregatedDiscountInfo,
    val aggregatedDiscountInfoV2: AggregatedDiscountInfoV2,
    val area: String,
    val availability: Availability,
    val avgRating: String,
    val badges: Badges,
    val chain: List<Any>,
    val city: String,
    val cityState: String,
    val cloudinaryImageId: String,
    val costForTwo: Int,
    val costForTwoString: String,
    val cuisines: List<String>,
    val deliveryTime: Int,
    val favorite: Boolean,
    val feeDetails: FeeDetails,
    val hasSurge: Boolean,
    val id: String,
    val lastMileTravel: Double,
    val lastMileTravelString: String,
    val locality: String,
    val longDistanceEnabled: Int,
    val maxDeliveryTime: Int,
    val minDeliveryTime: Int,
    val name: String,
    val new: Boolean,
    val parentId: Int,
    val promoted: Boolean,
    val rainMode: String,
    val ribbon: List<Ribbon>,
    val select: Boolean,
    val sla: Sla,
    val slaString: String,
    val slugs: Slugs,
    val tags: List<Any>,
    val thirdPartyAddress: Boolean,
    val thirdPartyVendor: String,
    val totalRatings: Int,
    val totalRatingsString: String,
    val tradeCampaignHeaders: List<Any>,
    val type: String,
    val unserviceable: Boolean,
    val uuid: String,
    val veg: Boolean
)