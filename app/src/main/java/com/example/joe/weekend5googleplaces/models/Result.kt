package com.example.joe.weekend5googleplaces.models

import com.google.gson.annotations.SerializedName

data class Result(@SerializedName("geometry") val geometry: Geometry,
                  @SerializedName("icon") val icon: String,
                  @SerializedName("id") val id:String,
                  @SerializedName("name") val name:String,
                  @SerializedName("opening_hours") val openingHours: OpeningHours,
                  @SerializedName("photos") val photos: List<Photo>,
                  @SerializedName("place_id") val placeId: String,
                  @SerializedName("plus_code") val plusCode: PlusCode,
                  @SerializedName("price_level") val priceLevel: Int,
                  @SerializedName("rating") val rating:Double,
                  @SerializedName("reference") val reference:String,
                  @SerializedName("scope") val scope:String,
                  @SerializedName("types") val types:List<String>,
                  @SerializedName("vicinity") val vicinity: String)