package com.paruyr.flightssearch.data.model

import com.google.gson.annotations.SerializedName

data class FlightDate(
    @field:SerializedName("dateOut") val originCode: String,
    @field:SerializedName("originName") val originCity: String,
    @field:SerializedName("flights") val flights: List<Flight>
)
