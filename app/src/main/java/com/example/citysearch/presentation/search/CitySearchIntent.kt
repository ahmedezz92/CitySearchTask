package com.example.citysearch.presentation.search

sealed class CitySearchIntent {
    data object LoadCities : CitySearchIntent()
    data class SearchCities(val prefix: String) : CitySearchIntent()
    data class FocusChanged(val isFocused: Boolean) : CitySearchIntent()
}