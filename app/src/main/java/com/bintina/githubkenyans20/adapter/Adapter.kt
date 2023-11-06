package com.bintina.githubkenyans20.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bintina.githubkenyans20.databinding.ItemRowBinding
import com.bintina.githubkenyans20.model.Developer

class Adapter():RecyclerView.Adapter<Adapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: ItemRowBinding): RecyclerView.ViewHolder(view.root) {
         fun bind(Developer: Developer?){
             TODO()
         }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}