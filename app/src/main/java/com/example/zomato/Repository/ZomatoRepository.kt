package com.example.zomato.Repository

import com.example.zomato.newmodel.Data
import com.example.zomato.newmodel.zomatodata
import com.example.zomato.retrofithelper.RetrofitHelper
import com.example.zomato.updatedmodel.DataItem
import retrofit2.Response

class ZomatoRepository {

    suspend fun getZomato():List<DataItem>{

        return RetrofitHelper.api.getZomatoData()
    }
}