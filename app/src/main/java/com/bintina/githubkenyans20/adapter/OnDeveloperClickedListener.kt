package com.bintina.githubkenyans20.adapter

import com.bintina.githubkenyans20.model.Developer

interface OnDeveloperClickedListener {

    fun openDetails(clickedDeveloper: Developer)

    fun openLink(link: String)
}