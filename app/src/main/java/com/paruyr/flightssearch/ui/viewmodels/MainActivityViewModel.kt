package com.paruyr.flightssearch.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paruyr.flightssearch.data.model.StationsResponse
import com.paruyr.flightssearch.data.repository.StationRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
    private val repository: StationRepository
) : ViewModel() {

    var servicesLiveData: MutableLiveData<StationsResponse>? = null

    suspend fun getAllAirports(): MutableLiveData<StationsResponse> {

        servicesLiveData = repository.getAllAirports()
        return servicesLiveData as MutableLiveData<StationsResponse>
    }
}