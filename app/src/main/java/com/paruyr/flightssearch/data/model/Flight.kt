package com.paruyr.flightssearch.data.model

import com.google.gson.annotations.SerializedName

data class Flight(
    @field:SerializedName("flightNumber") val flightNumber: String,
    @field:SerializedName("infantsLeft") val infantsLeft: Int,
    @field:SerializedName("faresLeft") val faresLeft: Int,
    @field:SerializedName("regularFare") val regularFare: RegularFare,
    @field:SerializedName("operatedBy") val operatedBy: String,
    @field:SerializedName("duration") val duration: String,
    @field:SerializedName("time") val time: List<String>
)
