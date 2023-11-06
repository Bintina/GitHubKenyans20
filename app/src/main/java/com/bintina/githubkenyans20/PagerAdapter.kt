package com.bintina.githubkenyans20

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.bintina.githubkenyans20.mombasa.controller.MombasaFragment
import com.bintina.githubkenyans20.nairobi.controller.NairobiFragment

class PagerAdapter(activity: FragmentActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> NairobiFragment()
            1 -> MombasaFragment()
            else -> throw IllegalStateException("Unexpected position $position")
        }
    }

}