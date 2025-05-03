package com.example.citysearch.data.source.local

import android.content.Context
import com.example.citysearch.data.source.model.CityEntity
import com.example.citysearch.data.util.JsonParser
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject


class CityLocalDataSource @Inject constructor(
    @ApplicationContext private val context: Context,
    private val jsonParser: JsonParser,
) {
    fun getCities(): Flow<List<CityEntity>> = flow {
        val citiesJson = context.assets.open("cities.json").bufferedReader().use { it.readText() }
        val cities = jsonParser.fromJson<List<CityEntity>>(citiesJson)
        emit(cities)
    }.flowOn(Dispatchers.IO)
}
