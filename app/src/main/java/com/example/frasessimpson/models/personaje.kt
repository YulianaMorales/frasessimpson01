package com.xcheko51x.frasessimpson.models

import com.google.gson.annotations.serializedName



data class personaje(
    @serializedName("quote")
    val frase: String,
    @serializedName("character")
    val personaje: String,
    @serializedName("image")
    val imagen: String,
    @serializedName("characterDirection")
    val direccionpersonaje: String

)

