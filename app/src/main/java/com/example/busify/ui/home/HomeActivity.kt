package com.example.busify.ui.home

import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.busify.R
import com.example.busify.databinding.ActivityHomeBinding
import com.example.busify.models.HomeRVModel
import com.example.busify.models.PassengerRVModel
import com.example.busify.ui.passenger.PassengerListActivity
import com.google.zxing.integration.android.IntentIntegrator

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private var homeRVData: List<HomeRVModel> ?= null
    private var qrScanIntegrator: IntentIntegrator? = null
    private val qr_vector: AppCompatImageView
        get() = findViewById(R.id.qr_vector)
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

        qr_vector.setOnClickListener()
        {
            val permission = ContextCompat.checkSelfPermission(this,android.Manifest.permission.CAMERA)
            if (permission != PackageManager.PERMISSION_GRANTED)
            {
                ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA),1)
            }
            else
            {
                openScanner()
            }
        }
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

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 1) {
            if (grantResults.isNotEmpty() && grantResults[0] != PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(applicationContext, "You need camera permission", Toast.LENGTH_SHORT).show()
            }
            else
            {
                openScanner()
            }
        }
    }

    private fun openScanner()
    {
        qrScanIntegrator?.initiateScan()
        qrScanIntegrator?.setOrientationLocked(false)
        qrScanIntegrator = IntentIntegrator(this)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
        if (result != null) {
            if (result.contents != null) {
                val intent = Intent(this, PassengerListActivity::class.java)
                intent.putExtra("QRresult",result.contents)
                startActivity(intent)
            }
            else {
                Toast.makeText(this,"Scanning Failed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
