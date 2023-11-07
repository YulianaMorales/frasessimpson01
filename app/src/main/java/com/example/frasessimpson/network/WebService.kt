package com.example.frasessimpson.network


import com.xcheko51x.frasessimpson.models.personaje
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.query

interface WebService {

    @GET("quotes?count=12")
    suspend fun obtenerPersonajes(): Response<list<personaje>>
    @GET("quotes")
    suspend fun obtenerpersonaje(
        @query("character") personaje: String
    ): Response<List<personaje>>
}