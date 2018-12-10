package com.example.joe.weekend5googleplaces.models

import com.google.gson.annotations.SerializedName

data class PlaceDataResponse(@SerializedName("html_attributions") val htmlAttributions: List<Any>,
                             @SerializedName("results") val results: List<Result>,
                             @SerializedName("status") val status: String)
