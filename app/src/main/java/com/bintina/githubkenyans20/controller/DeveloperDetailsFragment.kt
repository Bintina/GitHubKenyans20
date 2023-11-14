package com.bintina.githubkenyans20.controller

import android.content.Intent
import android.os.Bundle
import android.text.util.Linkify
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bintina.githubkenyans20.R
import com.bintina.githubkenyans20.databinding.FragmentDeveloperDetailsBinding
import com.bintina.githubkenyans20.model.Developer
import com.bumptech.glide.Glide

class DeveloperDetailsFragment: Fragment() {
    lateinit var binding: FragmentDeveloperDetailsBinding

    lateinit var developer: Developer

    lateinit var intent: Intent
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDeveloperDetailsBinding.inflate(layoutInflater)
        initializeViews()

        return binding.root
    }

    private fun initializeViews() {

        developer = intent.getParcelableExtra("clicked_developer")!!

        //Image
        Glide.with(this)
            .load(developer.avatarUrl)
            .placeholder(R.drawable.ic_launcher_foreground)
            .into(binding.userImageHeader)


        //Username
        binding.username.text = developer.login

        //Github link
        binding.githubLink.text = developer.htmlUrl
        Linkify.addLinks(binding.githubLink, Linkify.WEB_URLS)

        //Organizations
        binding.organizations.text = developer.organizationsUrl

      /*  //Back button
        binding.backButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }*/
    }


}