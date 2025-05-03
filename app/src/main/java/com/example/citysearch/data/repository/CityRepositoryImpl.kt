package com.example.citysearch.data.repository

import com.example.citysearch.data.source.local.CityLocalDataSource
import com.example.citysearch.domain.model.City
import com.example.citysearch.domain.repository.CityRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import kotlin.collections.map

class CityRepositoryImpl @Inject constructor(
    private val localDataSource: CityLocalDataSource
) : CityRepository {

    override fun getCities(): Flow<List<City>> {
        return localDataSource.getCities().map { entities ->
            entities.map { it.toCity() }
        }
    }

    override fun searchCities(prefix: String): Flow<List<City>> {
        return localDataSource.getCities().map { entities ->
            entities
                .map { it.toCity() }
                .filter {
                    if (prefix.isEmpty()) true
                    else it.name.startsWith(prefix, ignoreCase = true)
                }
                .sortedBy { it.name }
        }
    }
}