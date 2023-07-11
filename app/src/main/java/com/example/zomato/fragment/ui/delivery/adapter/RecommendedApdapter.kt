package com.example.zomato.fragment.ui.delivery.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.zomato.R
import com.example.zomato.databinding.ItemRecommendedBinding
import com.example.zomato.fragment.ui.delivery.model.Recommended

class RecommendedApdapter(
    private val recommendedList: ArrayList<Recommended>,
    private val context: Context
) : RecyclerView.Adapter<RecommendedApdapter.ViewHolder>() {

    lateinit var binding: ItemRecommendedBinding

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {/*
        val v: View = LayoutInflater.from(context).inflate(R.layout.item_recommended, parent, false)

        return ViewHolder(v)*/
        val layoutInflater = LayoutInflater.from(parent.context)

        binding = DataBindingUtil.inflate(
            layoutInflater, R.layout.item_recommended, parent, false
        )
        return ViewHolder(binding.root)


    }

    override fun getItemCount(): Int {
        return recommendedList.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val recommendedData: Recommended = recommendedList[position]
        binding.ivFoodImage.setImageResource(recommendedData.image)
        binding.tvFoodName.text = recommendedData.foodName
        binding.timeToDeliver.text = recommendedData.time
        binding.makingType.text = recommendedData.makingType

    }
}