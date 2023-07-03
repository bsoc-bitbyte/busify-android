package com.example.busify.ui.passenger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.busify.R
import com.example.busify.models.HomeRVModel
import com.example.busify.models.PassengerRVModel

class PassengerListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passenger_list)

        var passengerRVData = arrayListOf<PassengerRVModel>(
                PassengerRVModel("Passenger 1", true),
                PassengerRVModel("Passenger 2", false),
                PassengerRVModel("Passenger 3", true),
                PassengerRVModel("Passenger 4", false)
        )
    }
}