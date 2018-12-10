package com.example.joe.weekend5googleplaces.ui.hompage

import com.example.joe.weekend5googleplaces.base.BasePresenter
import com.example.joe.weekend5googleplaces.base.BaseView
import com.example.joe.weekend5googleplaces.models.PlaceDataResponse

interface MainContract {
    interface View:BaseView{
        fun showPlaces(places: PlaceDataResponse)
    }

    interface Presenter:BasePresenter{
        fun getPlace(location:String, type: String)
    }
}