package com.bintina.githubkenyans20

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.bintina.githubkenyans20.controller.JavaFragment
import com.bintina.githubkenyans20.util.MyApp.Companion.CURRENT_JAVA_STATE

class PagerAdapter(activity: FragmentActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        CURRENT_JAVA_STATE = position

        return when (position){
            0 -> JavaFragment()
            1 -> JavaFragment()
            else -> throw IllegalStateException("Unexpected position $position")
        }
    }

}