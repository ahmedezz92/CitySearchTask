package com.example.citysearch.presentation.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.citysearch.domain.model.City
import com.example.citysearch.domain.usecase.SearchCitiesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class CitySearchViewModel @Inject constructor(
    private val searchCitiesUseCase: SearchCitiesUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(CitySearchState())
    val state: StateFlow<CitySearchState> = _state

    fun processIntent(intent: CitySearchIntent) {
        when (intent) {
            is CitySearchIntent.LoadCities -> {
                loadCities()
            }
            is CitySearchIntent.SearchCities -> {
                searchCities(intent.prefix)
            }
            is CitySearchIntent.FocusChanged -> {
                _state.update { it.copy(isSearchBarFocused = intent.isFocused) }
            }
        }
    }

    private fun loadCities() {
        _state.update { it.copy(isLoading = true) }
        searchCitiesUseCase("")
            .onEach { cities ->
                val groupedCities = cities.groupBy { it.firstLetter }.toSortedMap()
                _state.update {
                    it.copy(
                        cities = cities,
                        filteredCities = cities,
                        groupedCities = groupedCities,
                        isLoading = false,
                        error = null
                    )
                }
            }
            .catch { e ->
                _state.update {
                    it.copy(
                        isLoading = false,
                        error = e.message ?: "Unknown error occurred"
                    )
                }
            }
            .launchIn(viewModelScope)
    }

    private fun searchCities(prefix: String) {
        _state.update { it.copy(searchQuery = prefix) }
        
        searchCitiesUseCase(prefix)
            .onEach { cities ->
                val groupedCities = cities.groupBy { it.firstLetter }.toSortedMap()
                _state.update {
                    it.copy(
                        filteredCities = cities,
                        groupedCities = groupedCities,
                        error = null
                    )
                }
            }
            .catch { e ->
                _state.update {
                    it.copy(
                        error = e.message ?: "Unknown error occurred"
                    )
                }
            }
            .launchIn(viewModelScope)
    }
}
private val City.firstLetter: Char
    get() = name.firstOrNull()?.uppercaseChar() ?: '#'
