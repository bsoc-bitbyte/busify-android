package com.example.busify.ui.QR

import android.icu.text.IDNA.Info
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.busify.databinding.QrItemsBinding
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.busify.models.PassengerRVModel

class QrRVAdapter(private var qrItems: List<PassengerRVModel>):
    RecyclerView.Adapter<QrRVAdapter.ViewHolder>() {
    class ViewHolder(binding:QrItemsBinding) : RecyclerView.ViewHolder(binding.root) {
        val username = binding.username
        val info = binding.info
        val verifyswitch=binding.verifySwitch
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(QrItemsBinding.inflate(
            LayoutInflater.from(parent.context),parent,false
        ))
    }
    override fun getItemCount(): Int {
        return qrItems.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = qrItems[position]
        holder.username.text = model.name
       holder.verifyswitch.isChecked=model.isVerified

    }

    }

