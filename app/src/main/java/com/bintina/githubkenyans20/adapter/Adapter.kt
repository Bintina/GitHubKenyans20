package com.bintina.githubkenyans20.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bintina.githubkenyans20.R
import com.bintina.githubkenyans20.databinding.ItemRowBinding
import com.bintina.githubkenyans20.model.Developer
import com.bumptech.glide.Glide

class Adapter():RecyclerView.Adapter<Adapter.ItemViewHolder>() {

    var developerList: List<Developer?> = mutableListOf()
    lateinit var listener: OnDeveloperClickedListener
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ItemRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Adapter.ItemViewHolder(binding)
    }

    override fun getItemCount(): Int = developerList.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(developerList[position], listener)




    }

    class ItemViewHolder(private val view: ItemRowBinding): RecyclerView.ViewHolder(view.root) {
         fun bind(developer: Developer?, listener: OnDeveloperClickedListener){
             //Image View
             Glide.with(view.tvAvatar.context)
                 .load(developer?.avatarUrl)
                 .placeholder(R.drawable.ic_launcher_foreground)
                 .into(view.tvAvatar)

             //Username View
             view.tvUsername.text = developer?.login


             //Link View
             view.tvLink.text = developer?.htmlUrl
             view.tvLink.setOnClickListener { listener.openLink(developer?.htmlUrl.toString()) }
         }
    }
}