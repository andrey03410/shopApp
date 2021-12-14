package ru.agel.example.shopAndroid.network

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.agel.example.shopAndroid.services.CakesService
import ru.agel.example.shopAndroid.services.CakesServiceApi

internal object AppNetwork {
    private val gson = GsonBuilder().create()

    private val okHttpClient= OkHttpClient().newBuilder().build()

    private val retrofit = Retrofit.Builder()
        .client(okHttpClient)
        .baseUrl("http://192.168.0.100:8080/")
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    val cakesService by lazy{
        val cakesServiceApi = retrofit.create(CakesServiceApi::class.java)
        CakesService(cakesServiceApi)
    }
}