package com.bintina.githubkenyans20.mombasa.controller

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.bintina.githubkenyans20.adapter.Adapter
import com.bintina.githubkenyans20.data.DataSource
import com.bintina.githubkenyans20.databinding.FragmentMombasaJavaBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MombasaFragment: Fragment() {
    lateinit var adapter: Adapter

    private var _binding: FragmentMombasaJavaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMombasaJavaBinding.inflate(inflater, container, false)
        initializeViews()

        lifecycleScope.launch(Dispatchers.IO){
            val result = DataSource.loadMombasaJavaDevelopers()
            withContext(Dispatchers.Main){
                if (result != null){
                    adapter.developerList = result
                    adapter.notifyDataSetChanged()
                }
            }
        }
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun initializeViews(){
        adapter = Adapter()
        binding.mombasaRecycler.adapter = adapter
    }
}