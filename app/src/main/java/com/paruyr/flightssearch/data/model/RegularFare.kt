package com.paruyr.flightssearch.data.model

import com.google.gson.annotations.SerializedName

data class RegularFare(
    @field:SerializedName("fareClass") val fareClass: String,
    @field:SerializedName("fares") val fares: List<Fare>
)