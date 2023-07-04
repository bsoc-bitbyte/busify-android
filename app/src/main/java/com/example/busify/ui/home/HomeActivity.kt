package com.example.busify.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.busify.R
import com.example.busify.databinding.ActivityHomeBinding
import com.example.busify.models.HomeRVModel

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var homeRVData = arrayListOf<HomeRVModel>(
            HomeRVModel("Bus 1", "10:00"),
            HomeRVModel("Bus 2", "10:30"),
            HomeRVModel("Bus 3", "11:00"),
            HomeRVModel("Bus 4", "11:30")
        )



    }
}