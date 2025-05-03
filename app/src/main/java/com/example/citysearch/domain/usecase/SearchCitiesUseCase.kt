package com.example.citysearch.domain.usecase

import com.example.citysearch.domain.model.City
import com.example.citysearch.domain.repository.CityRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SearchCitiesUseCase @Inject constructor(
    private val repository: CityRepository
) {
    operator fun invoke(prefix: String): Flow<List<City>> {
        return repository.searchCities(prefix)
    }
}