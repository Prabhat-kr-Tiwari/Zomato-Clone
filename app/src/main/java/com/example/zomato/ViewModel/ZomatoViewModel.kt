package com.example.zomato.ViewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.zomato.Repository.ZomatoRepository
import com.example.zomato.updatedmodel.DataItem
import kotlinx.coroutines.launch

/*
class ZomatoViewModel(private val zomatoRepository: ZomatoRepository): ViewModel() {



    val zomatoMutableLiveData: MutableLiveData<List<Data>>=MutableLiveData()
    fun getZomato()
    {
        viewModelScope.launch{
            try{
                val response = zomatoRepository.getZomato()
                zomatoMutableLiveData.value = response

            }catch (e:Exception){
                Log.d("main", "getPost: ${e.message}")
            }
        }
    }
}*/
class ZomatoViewModel(private val zomatoRepository: ZomatoRepository) : ViewModel() {

    val zomatoMutableLiveData: MutableLiveData<List<DataItem>> = MutableLiveData()

    fun getZomato() {
        viewModelScope.launch {
            try {
                val response = zomatoRepository.getZomato()
                zomatoMutableLiveData.value = response

                for (item in response) {
                    Log.d("PRABHAT", "Food -> ${item.foodItemName}")
                }

                /*response?.let {
                    zomatoMutableLiveData.value = response
                }*/
            } catch (e: Exception) {
                Log.d("ZomatoViewModel", "getZomato: ${e.message}")
            }
        }
    }
}

