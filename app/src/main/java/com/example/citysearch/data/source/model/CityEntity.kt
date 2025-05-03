package com.example.citysearch.data.source.model

import com.example.citysearch.domain.model.City
import com.example.citysearch.domain.model.Coord
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CityEntity(
    val country: String,
    val name: String,
    @SerialName("_id") val id: Int,
    val coord: Coord
) {
    fun toCity(): City {
        return City(
            country = country,
            name = name,
            _id = id,
            coord = coord
        )
    }
}