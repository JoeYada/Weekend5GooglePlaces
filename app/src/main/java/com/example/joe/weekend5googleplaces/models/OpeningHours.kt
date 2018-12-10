package com.example.joe.weekend5googleplaces.models

import com.google.gson.annotations.SerializedName

data class OpeningHours(@SerializedName("open_now") val openNow: Boolean) {
}