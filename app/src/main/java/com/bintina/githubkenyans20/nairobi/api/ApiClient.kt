package com.bintina.githubkenyans20.nairobi.api

import com.bintina.githubkenyans20.model.DeveloperResult
import com.bintina.githubkenyans20.util.Constants.NRB_JAVA_END_URL
import retrofit2.http.GET

interface ApiClient {
    @GET(NRB_JAVA_END_URL)
    suspend fun getNairobiJavaDevelopers(): DeveloperResult?
}