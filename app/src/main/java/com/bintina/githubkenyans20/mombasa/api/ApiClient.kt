package com.bintina.githubkenyans20.mombasa.api

import com.bintina.githubkenyans20.model.DeveloperResult
import com.bintina.githubkenyans20.util.Constants.MBA_JAVA_END_URL
import retrofit2.http.GET

interface ApiClient {
    @GET(MBA_JAVA_END_URL)
    suspend fun getMombasaJavaDevelopers(): DeveloperResult?
}