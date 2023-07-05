package com.example.busify.ui.passenger

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.busify.databinding.PassengerlistItemsBinding
import com.example.busify.models.PassengerRVModel

class PassengerRVAdapter(private var passengerlist: List<PassengerRVModel>):
        RecyclerView.Adapter<PassengerRVAdapter.ViewHolder>() {
                class ViewHolder(binding: PassengerlistItemsBinding) : RecyclerView.ViewHolder(binding.root) {
                        val username = binding.username
                        val info = binding.info
                        val verify = binding.verify
                }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
                return ViewHolder(PassengerlistItemsBinding.inflate(
                        LayoutInflater.from(parent.context),parent,false
                ))
        }

        override fun getItemCount(): Int {
                return passengerlist.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
                val model = passengerlist[position]
                holder.username.text = model.name
                if (model.isVerified) {
                        holder.verify.text = "Verified"
                        holder.verify.setTextColor(Color.parseColor("#0DA72F"))
                }
                else {
                        holder.verify.text = "Unverified"
                        holder.verify.setTextColor(Color.parseColor("#A70D0D"))
                }
        }
}