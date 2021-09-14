package com.paruyr.flightssearch.api

import com.paruyr.flightssearch.BuildConfig
import com.paruyr.flightssearch.data.model.FlightsResponse
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface FlightsSearchService {
    @GET("search/photos")
    suspend fun searchFlights(
        @Query("query") query: String,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): FlightsResponse

    companion object {
        private const val BASE_URL = BuildConfig.RYANAIR_URL

        fun create(): FlightsSearchService {
            val logger = HttpLoggingInterceptor().apply { level = Level.BASIC }

            val client = OkHttpClient.Builder()
                .addInterceptor(logger)
                .build()

            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(FlightsSearchService::class.java)
        }
    }
}