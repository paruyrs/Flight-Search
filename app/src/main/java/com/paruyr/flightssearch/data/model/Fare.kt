package com.paruyr.flightssearch.data.model

import com.google.gson.annotations.SerializedName

data class Fare(
    @field:SerializedName("type") val type: String,
    @field:SerializedName("amount") val amount: Float
)
