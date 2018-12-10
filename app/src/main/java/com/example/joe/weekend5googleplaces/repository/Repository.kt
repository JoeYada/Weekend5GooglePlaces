package com.example.joe.weekend5googleplaces.repository

import com.example.joe.weekend5googleplaces.models.PlaceDataResponse
import io.reactivex.Single

interface Repository {
    fun getPlaces(location: String, type: String): Single<PlaceDataResponse>
}