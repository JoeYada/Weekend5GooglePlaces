package com.example.joe.weekend5googleplaces.remote

import com.example.joe.weekend5googleplaces.common.API_KEY
import com.example.joe.weekend5googleplaces.models.PlaceDataResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface RemotePlacesServices {
    @GET("maps/api/place/nearbysearch/json")
    fun getPlaces(@Query("location") location: String,
                  @Query("type") type: String,
                  @Query("radius") radius: Int,
                  @Query("sensor") sensor: Boolean,
                  @Query(API_KEY) key:String): Single<PlaceDataResponse>
}