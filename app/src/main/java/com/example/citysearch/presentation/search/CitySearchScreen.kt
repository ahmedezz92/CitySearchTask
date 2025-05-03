package com.example.citysearch.presentation.search

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Error
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.citysearch.presentation.components.CityList
import com.example.citysearch.presentation.components.SearchBar
@Composable
fun CitySearchScreen(
    viewModel: CitySearchViewModel
) {
    val state by viewModel.state.collectAsState()
    val snackbarHostState = remember { SnackbarHostState() }
    
    // Load cities on first composition
    LaunchedEffect(key1 = Unit) {
        viewModel.processIntent(CitySearchIntent.LoadCities)
    }
    
    // Show error in Snackbar if present
    LaunchedEffect(key1 = state.error) {
        state.error?.let {
            snackbarHostState.showSnackbar(it)
        }
    }
    
    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Text(
                text = "City Search",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(16.dp)
            )
            
            SearchBar(
                query = state.searchQuery,
                onQueryChange = { query ->
                    viewModel.processIntent(CitySearchIntent.SearchCities(query))
                },
                onFocusChange = { isFocused ->
                    viewModel.processIntent(CitySearchIntent.FocusChanged(isFocused))
                },
                focused = state.isSearchBarFocused
            )
            
            Spacer(modifier = Modifier.height(8.dp))
            
            // Error state
            AnimatedVisibility(
                visible = state.error != null && !state.isLoading,
                enter = fadeIn(),
                exit = fadeOut()
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            imageVector = Icons.Default.Error,
                            contentDescription = "Error",
                            tint = MaterialTheme.colorScheme.error
                        )
                        Text(
                            text = state.error ?: "Unknown error",
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.error
                        )
                    }
                }
            }
            
            // City list
            CityList(
                groupedCities = state.groupedCities,
                isLoading = state.isLoading
            )
        }
    }
}