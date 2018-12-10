package com.example.joe.weekend5googleplaces.repository

import com.example.joe.weekend5googleplaces.models.PlaceDataResponse
import com.example.joe.weekend5googleplaces.remote.RemotePlacesHelper
import com.example.joe.weekend5googleplaces.remote.RemotePlacesServices
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class RepositoryImpl(): Repository {
    override fun getPlaces(location: String, type: String): Single<PlaceDataResponse> {
        return RemotePlacesHelper.getPlaces(location, type).subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }
}