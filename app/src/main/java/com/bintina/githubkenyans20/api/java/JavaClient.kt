package com.bintina.githubkenyans20.api.java

import com.bintina.githubkenyans20.model.DeveloperResult
import com.bintina.githubkenyans20.util.Constants.MBA_JAVA_END_URL
import com.bintina.githubkenyans20.util.Constants.NRB_JAVA_END_URL
import com.bintina.githubkenyans20.util.MyApp.Companion.CURRENT_END_URL
import retrofit2.http.GET

interface JavaClient {
    @GET(NRB_JAVA_END_URL)
    suspend fun getNairobiDevelopers(): DeveloperResult?

    @GET(MBA_JAVA_END_URL)
    suspend fun getMombasaDevelopers(): DeveloperResult?

}