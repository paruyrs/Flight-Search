package com.paruyr.flightssearch.data.model

import com.google.gson.annotations.SerializedName

data class Trip (
    @field:SerializedName("origin") val originCode: String,
    @field:SerializedName("originName") val originCity: String,
    @field:SerializedName("destination") val destinationCode: String,
    @field:SerializedName("destinationName") val destinationCity: String,
    @field:SerializedName("currency") val currency: String,
    @field:SerializedName("dates") val dates: List<FlightDate>
)
