package com.example.citysearch.presentation.search

import com.example.citysearch.domain.model.City

data class CitySearchState(
    val cities: List<City> = emptyList(),
    val filteredCities: List<City> = emptyList(),
    val searchQuery: String = "",
    val isLoading: Boolean = false,
    val isSearchBarFocused: Boolean = false,
    val error: String? = null,
    val groupedCities: Map<Char, List<City>> = emptyMap()
)