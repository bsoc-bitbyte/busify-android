package com.example.busify.ui.QR

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.busify.R
import com.example.busify.databinding.ActivityQractivityBinding
import com.example.busify.models.PassengerRVModel

class QRActivity : AppCompatActivity() {
    private lateinit var binding:ActivityQractivityBinding
    private var qrRVData: List<PassengerRVModel> ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQractivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        qrRVData = arrayListOf<PassengerRVModel>(
            PassengerRVModel("Passenger 1", true),
            PassengerRVModel("Passenger 2", false),
            PassengerRVModel("Passenger 3", true),
            PassengerRVModel("Passenger 4", false)
        )
    setupRV()
    }
    private fun setupRV(){
        val rvadapter = QrRVAdapter(qrRVData!!)
        binding.apply {
            verifiedListRv.apply {
                setHasFixedSize(true)
                layoutManager = LinearLayoutManager(this@QRActivity)
                adapter = rvadapter
            }
        }
    }

    }
