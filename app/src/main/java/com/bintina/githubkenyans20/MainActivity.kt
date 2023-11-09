package com.bintina.githubkenyans20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.util.Linkify
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.bintina.githubkenyans20.adapter.OnDeveloperClickedListener
import com.bintina.githubkenyans20.databinding.ActivityMainBinding
import com.bintina.githubkenyans20.model.Developer
import com.google.android.material.tabs.TabLayout
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
