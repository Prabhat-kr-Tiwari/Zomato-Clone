package com.example.zomato.fragment.ui.delivery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.zomato.R
import com.example.zomato.databinding.FragmentDeliveryBinding
import com.example.zomato.fragment.ui.delivery.adapter.RecommendedApdapter
import com.example.zomato.fragment.ui.delivery.model.Recommended

class DeliveryFragment : Fragment() {

    private var _binding: FragmentDeliveryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        val dashboardViewModel =
            ViewModelProvider(this).get(DeliveryViewModel::class.java)

        _binding = FragmentDeliveryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val arrayList: ArrayList<Recommended> = ArrayList()
        super.onViewCreated(view, savedInstanceState)
        val recommendedItem = Recommended(
            image = R.drawable.foodimage,
            foodName = "Pizza",
            makingType = "Baked",
            time = "30 minutes"
        )

        val rv_recommended = view.findViewById<RecyclerView>(R.id.rv_recommended)

        arrayList.add(recommendedItem)
        arrayList.add(Recommended(R.drawable.foodimage, "Samosa", "Fried", "20 min"))
        arrayList.add(Recommended(R.drawable.foodimage, "Samosa", "Fried", "20 min"))
        arrayList.add(Recommended(R.drawable.foodimage, "Samosa", "Fried", "20 min"))
        arrayList.add(Recommended(R.drawable.foodimage, "Samosa", "Fried", "20 min"))
        arrayList.add(Recommended(R.drawable.foodimage, "Samosa", "Fried", "20 min"))
        arrayList.add(Recommended(R.drawable.foodimage, "Samosa", "Fried", "20 min"))
        arrayList.add(Recommended(R.drawable.foodimage, "Samosa", "Fried", "20 min"))
        arrayList.add(Recommended(R.drawable.foodimage, "Samosa", "Fried", "20 min"))
        arrayList.add(Recommended(R.drawable.foodimage, "Samosa", "Fried", "20 min"))
        arrayList.add(Recommended(R.drawable.foodimage, "Samosa", "Fried", "20 min"))
        arrayList.add(Recommended(R.drawable.foodimage, "Samosa", "Fried", "20 min"))
        arrayList.add(Recommended(R.drawable.foodimage, "Samosa", "Fried", "20 min"))
        arrayList.add(Recommended(R.drawable.foodimage, "Samosa", "Fried", "20 min"))
        arrayList.add(Recommended(R.drawable.foodimage, "Samosa", "Fried", "20 min"))
        rv_recommended.layoutManager =
            GridLayoutManager(requireContext(), 2, RecyclerView.HORIZONTAL, false)
        val adapter = RecommendedApdapter(arrayList, requireContext())
        rv_recommended.adapter = adapter

        val rvExplore = view.findViewById<RecyclerView>(R.id.rv_explore)
        rvExplore.layoutManager=
            GridLayoutManager(requireContext(), 2, RecyclerView.HORIZONTAL, false)
        rvExplore.adapter=adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}