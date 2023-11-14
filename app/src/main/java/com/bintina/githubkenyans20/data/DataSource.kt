package com.bintina.githubkenyans20.data

import android.util.Log
import com.bintina.githubkenyans20.model.Developer
import com.bintina.githubkenyans20.util.MyApp.Companion.CURRENT_JAVA_STATE

object DataSource {

    suspend fun loadJavaDevelopers(): List<Developer?>? {
        val apiCall = com.bintina.githubkenyans20.api.java.JavaService.create()

        val response = when (CURRENT_JAVA_STATE){
            0 -> try {
                apiCall.getMombasaDevelopers()
            } catch (e: Exception){
            Log.e("NairobiJavaDataSourceLog","Error is ${e.message.toString()}")
                null
            }
            1 -> try {
                apiCall.getNairobiDevelopers()
            } catch (e: Exception){
            Log.e("MombasaJavaDataSourceLog","Error is ${e.message.toString()}")
                null
            }
            else -> {null}
        }
        return response?.items
    }

}