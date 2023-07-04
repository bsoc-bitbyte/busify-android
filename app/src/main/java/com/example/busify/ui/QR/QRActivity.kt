package com.example.busify.ui.QR

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.busify.R
import com.example.busify.databinding.ActivityQractivityBinding
import com.example.busify.models.PassengerRVModel

class QRActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQractivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQractivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var passengerRVData = arrayListOf<PassengerRVModel>(
            PassengerRVModel("Passenger 1", true),
            PassengerRVModel("Passenger 2", false),
            PassengerRVModel("Passenger 3", true),
            PassengerRVModel("Passenger 4", false)
        )
    }
}