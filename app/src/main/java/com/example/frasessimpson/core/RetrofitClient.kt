package com.example.frasessimpson.core

import com.example.frasessimpson.network.WebService

object RetrofitClient {
    val webService: webService by lazy {
        val constantes
        Retrofit.Builder()
            .baseUrl(constantes.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
            .create(WebService::class.java)

    }
}
