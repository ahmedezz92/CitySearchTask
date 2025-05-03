package com.example.citysearch.domain.repository

import com.example.citysearch.domain.model.City
import kotlinx.coroutines.flow.Flow

interface CityRepository {
    fun getCities(): Flow<List<City>>
    fun searchCities(prefix: String): Flow<List<City>>
}