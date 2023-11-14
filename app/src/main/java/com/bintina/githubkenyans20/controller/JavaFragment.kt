package com.bintina.githubkenyans20.controller

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.bintina.githubkenyans20.adapter.Adapter
import com.bintina.githubkenyans20.adapter.OnDeveloperClickedListener
import com.bintina.githubkenyans20.data.DataSource
import com.bintina.githubkenyans20.databinding.FragmentMombasaJavaBinding
import com.bintina.githubkenyans20.model.Developer
import com.bintina.githubkenyans20.util.MyApp.Companion.CURRENT_JAVA_STATE
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class JavaFragment : Fragment(), OnDeveloperClickedListener {
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

        lifecycleScope.launch(Dispatchers.IO) {
            val result = DataSource.loadJavaDevelopers()

            withContext(Dispatchers.Main) {
                if (result != null) {
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

    private fun initializeViews() {
        adapter = Adapter()
        adapter.listener = this
        binding.mombasaRecycler.adapter = adapter
    }

    override fun openDetails(clickedDeveloper: Developer) {
        /*    val intent = Intent(this, DeveloperDetailsFragment::class.java)
            intent.putExtra("clicked_developer", clickedDeveloper)
            startActivity(intent)*/
    }

    override fun openLink(link: String) {
        val newsSite = Uri.parse(link)
        val intent = Intent(Intent.ACTION_VIEW, newsSite)

        startActivity(intent)
    }
}