package com.example.zomato.Interface


import com.example.zomato.model.ZomatoData
import com.example.zomato.newmodel.Data
import com.example.zomato.newmodel.zomatodata
import com.example.zomato.updatedmodel.DataItem
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

// http://192.168.1.17:8000/api/data
interface ZomatoAPI {
/*
    @GET("api/data")
    suspend fun getRestaurantList(): Call<List<ZomatoData>>*/

    /*@GET("api/data")
    suspend fun getRestaurantList(): Response<ZomatoData>*/

    @GET("data.json")
    suspend fun getZomatoData(): List<DataItem>
}

