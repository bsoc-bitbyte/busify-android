package com.example.busify.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.busify.models.HomeRVModel
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.busify.databinding.HomeItemsBinding

class HomeRVAdapter(private var homeItems:List<HomeRVModel>):
    RecyclerView.Adapter<HomeRVAdapter.ViewHolder>(){
    class ViewHolder(binding: HomeItemsBinding) : RecyclerView.ViewHolder(binding.root) {
        val bus = binding.textView
        val time = binding.textView2
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeRVAdapter.ViewHolder {
        return HomeRVAdapter.ViewHolder(
            HomeItemsBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }
    override fun getItemCount(): Int {
        return homeItems.size
    }
    override fun onBindViewHolder(holder: HomeRVAdapter.ViewHolder, position: Int) {
        val model = homeItems[position]
        holder.bus.text=model.busNo
        holder.time.text = model.busTiming

    }

}