package com.sampam.apipracticeapp
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object retroservice {

    val retrofit=Retrofit.Builder()
        .baseUrl(constants.BASE_URl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val retroInstance= retrofit.create(retroInterface::class.java)
}