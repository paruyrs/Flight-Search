package com.paruyr.flightssearch.api

import com.paruyr.flightssearch.BuildConfig
import com.paruyr.flightssearch.data.model.StationsResponse
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface StationService {
    @GET("stations.json")
    suspend fun getAllStations(): Call<StationsResponse>

    companion object {
        private const val BASE_URL = BuildConfig.AIRPORTS_URL

        fun create(): StationService {
            val logger = HttpLoggingInterceptor().apply { level = Level.BASIC }

            val client = OkHttpClient.Builder()
                .addInterceptor(logger)
                .build()

            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(StationService::class.java)
        }
    }
}