package com.bintina.githubkenyans20.nairobi.controller

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bintina.githubkenyans20.adapter.Adapter
import com.bintina.githubkenyans20.databinding.FragmentNairobiJavaBinding

class NairobiFragment: Fragment() {
    lateinit var adapter: Adapter

    private var _binding: FragmentNairobiJavaBinding? =null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        TODO()
    }

    override fun onDestroy() {
        super.onDestroy()
        TODO()
    }

    private fun initializeViews(){
        TODO()
    }
}