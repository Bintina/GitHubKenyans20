package com.bintina.githubkenyans20.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bintina.githubkenyans20.PagerAdapter
import com.bintina.githubkenyans20.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupViewPager()
    }

    private fun setupViewPager() {
        binding.pager.adapter = PagerAdapter(this)

        TabLayoutMediator(binding.tabLayout, binding.pager){ tab, position ->
            tab.text = when (position){
                0 -> "Nairobi"
                1 -> "Mombasa"
                else -> throw IllegalStateException("Unexpected position $position")
            }
        }
            .attach()
    }

}
