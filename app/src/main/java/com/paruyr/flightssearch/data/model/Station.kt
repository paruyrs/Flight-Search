package com.paruyr.flightssearch.data.model

import com.google.gson.annotations.SerializedName

data class Station(
    @field:SerializedName("countryName") val country: String,
    @field:SerializedName("name") val airport: String,
    @field:SerializedName("code") val code: String
)
