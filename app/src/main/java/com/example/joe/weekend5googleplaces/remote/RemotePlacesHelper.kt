package com.example.joe.weekend5googleplaces.remote

import com.example.joe.weekend5googleplaces.common.API_KEY
import com.example.joe.weekend5googleplaces.common.BASE_URL
import com.example.joe.weekend5googleplaces.common.RADIUS
import com.example.joe.weekend5googleplaces.models.PlaceDataResponse
import io.reactivex.Single
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RemotePlacesHelper {
    fun getPlaces(location:String, type:String): Single<PlaceDataResponse> {
        val interceptor =  HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY

        val okHttpClient = OkHttpClient.Builder().addInterceptor(interceptor).build()

        val retrofit = Retrofit.Builder().client(okHttpClient)
            .baseUrl(BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create()).build()

        val service = retrofit.create(RemotePlacesServices::class.java)

        return service.getPlaces(location, type, RADIUS, true, API_KEY)
    }
}