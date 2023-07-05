package com.example.busify.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.busify.R
import com.example.busify.databinding.ActivityHomeBinding
import com.example.busify.models.HomeRVModel
import com.example.busify.models.PassengerRVModel

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private var homeRVData: List<HomeRVModel> ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

         homeRVData = arrayListOf<HomeRVModel>(
            HomeRVModel("Bus 1", "10:00"),
            HomeRVModel("Bus 2", "10:30"),
            HomeRVModel("Bus 3", "11:00"),
            HomeRVModel("Bus 4", "11:30")
         )
        setupRV()
    }

    private fun setupRV(){
        val rvAdapter=HomeRVAdapter(homeRVData!!)
        binding.apply {
            recyclerViewHome.apply{
                setHasFixedSize(true)
                layoutManager = LinearLayoutManager(this@HomeActivity)
                adapter = rvAdapter
            }
        }
    }
}