package com.example.zomato.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.zomato.R
import com.example.zomato.Repository.ZomatoRepository
import com.example.zomato.ViewModel.ZomatoViewModel
import com.example.zomato.ViewModel.ZomatoViewModelFactory

class MainActivity : AppCompatActivity() {
    private lateinit var zomatoViewModel: ZomatoViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text: String = "not found"
        //create object of zomato repository
        val zomatoRepository = ZomatoRepository()
        //create object of viewmodelfactory
        val viewModelFactory = ZomatoViewModelFactory(zomatoRepository)
        zomatoViewModel = ViewModelProvider(this, viewModelFactory).get(ZomatoViewModel::class.java)
        zomatoViewModel.getZomato()
        zomatoViewModel.zomatoMutableLiveData.observe(this, Observer { response ->
            Log.d("new dataaa",response.toString())


        })
    }

}


