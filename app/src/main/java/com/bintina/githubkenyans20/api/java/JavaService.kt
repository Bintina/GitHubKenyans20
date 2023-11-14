package com.bintina.githubkenyans20.api.java

import com.bintina.githubkenyans20.util.Constants.BASE_URL
import com.bintina.githubkenyans20.util.MyApp.Companion.CURRENT_JAVA_STATE
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class JavaService {
    companion object {
        fun create(): JavaClient {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(JavaClient::class.java)

        }
    }
}