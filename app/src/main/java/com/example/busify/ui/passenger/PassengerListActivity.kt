package com.example.busify.ui.passenger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.busify.databinding.ActivityPassengerListBinding
import com.example.busify.models.PassengerRVModel

class PassengerListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPassengerListBinding
    private var passengerRVData: List<PassengerRVModel> ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPassengerListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var passengerRVData = arrayListOf<PassengerRVModel>(
            PassengerRVModel("Passenger 1", true),
            PassengerRVModel("Passenger 2", false),
            PassengerRVModel("Passenger 3", true),
            PassengerRVModel("Passenger 4", false)
        )

        setupRV()

        var qrscanResult:String?=intent.getStringExtra("QRresult")
        Toast.makeText(this, qrscanResult, Toast.LENGTH_LONG).show()
    }

    private fun setupRV() {
        val rvadapter = PassengerRVAdapter(passengerRVData!!)
        binding.apply {
            rvPassengers.apply {
                setHasFixedSize(true)
                layoutManager = LinearLayoutManager(this@PassengerListActivity)
                adapter = rvadapter
            }
        }
    }

}