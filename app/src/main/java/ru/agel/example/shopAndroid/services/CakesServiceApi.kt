package ru.agel.example.shopAndroid.services

import retrofit2.Response
import retrofit2.http.GET
import ru.agel.example.shopAndroid.data.receivedItems.GetCakesListBack

internal interface CakesServiceApi {

    @GET("cakes")
    suspend fun getCakes(): Response<GetCakesListBack>

}