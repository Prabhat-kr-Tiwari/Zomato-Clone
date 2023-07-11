package com.example.zomato.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.zomato.Repository.ZomatoRepository

class ZomatoViewModelFactory(private val zomatoRepository: ZomatoRepository):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T =
        ZomatoViewModel(zomatoRepository) as T
}