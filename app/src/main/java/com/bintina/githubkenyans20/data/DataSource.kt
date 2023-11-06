package com.bintina.githubkenyans20.data

import android.util.Log
import com.bintina.githubkenyans20.model.Developer
import com.bintina.githubkenyans20.mombasa.api.ApiService

object DataSource {

    suspend fun loadMombasaJavaDevelopers(): List<Developer?>? {
        val apiCall = ApiService.create()

        val response = try {
            apiCall.getMombasaJavaDevelopers()
        } catch(e: Exception){
            Log.e("MombasaDataSourceLog","Error is ${e.message.toString()}")
            null
        }
        return response?.items
    }

    suspend fun loadNairobiJavaDevelopers(): List<Developer?>?{
        val apiCall = com.bintina.githubkenyans20.nairobi.api.ApiService.create()

        val response = try {
            apiCall.getNairobiJavaDevelopers()
        } catch (e: Exception){
            Log.e ("NairobiDataSourceLog", "Error is ${e.message.toString()}")
            null
        }

        return response?.items
    }
}