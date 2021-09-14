package com.paruyr.flightssearch.data.model

import com.google.gson.annotations.SerializedName

data class FlightsResponse(
    @field:SerializedName("trips") val trips: List<Trip>,
    @field:SerializedName("currency") val currency: String

)
