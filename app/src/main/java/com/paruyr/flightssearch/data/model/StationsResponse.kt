package com.paruyr.flightssearch.data.model

import com.google.gson.annotations.SerializedName
import com.paruyr.flightssearch.data.model.Station

data class StationsResponse(
    @field:SerializedName("stations") val stations: List<Station>
)
