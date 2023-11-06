package com.bintina.githubkenyans20.model


import com.google.gson.annotations.SerializedName

data class DeveloperResult(
    @SerializedName("incomplete_results")
    val incompleteResults: Boolean?,
    @SerializedName("items")
    val items: List<Developer?>?,
    @SerializedName("total_count")
    val totalCount: Int?
)