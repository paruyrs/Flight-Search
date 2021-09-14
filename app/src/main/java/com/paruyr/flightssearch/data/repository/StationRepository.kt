package com.paruyr.flightssearch.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.paruyr.flightssearch.api.StationService
import com.paruyr.flightssearch.data.model.Station
import com.paruyr.flightssearch.data.model.StationsResponse
import javax.inject.Inject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class StationRepository @Inject constructor(private val service: StationService) {

    val serviceSetterGetter = MutableLiveData<StationsResponse>()

    suspend fun getAllAirports(): MutableLiveData<StationsResponse> {

        val stationsResponse = service.getAllStations()

        stationsResponse.enqueue(object : Callback<StationsResponse> {
            override fun onFailure(call: Call<StationsResponse>, t: Throwable) {
                Log.v("DEBUG : ", t.message.toString())
            }

            override fun onResponse(
                call: Call<StationsResponse>,
                response: Response<StationsResponse>
            ) {
                Log.v("DEBUG : ", response.body().toString())
                val data = response.body()
                val stations = data!!.stations
                serviceSetterGetter.value = StationsResponse(stations)
            }
        })

        return serviceSetterGetter

    }
}