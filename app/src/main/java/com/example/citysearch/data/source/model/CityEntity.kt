package com.example.citysearch.data.source.model

import com.example.citysearch.domain.model.City
import com.example.citysearch.domain.model.Coord
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CityEntity(
    @SerialName("country") val country: String,
    @SerialName("name") val name: String,
    @SerialName("_id") val id: Int,
    @SerialName("lat") val lat: Double,
    @SerialName("lon") val lon: Double,
) {
    fun toCity(): City {
        return City(
            country = country,
            name = name,
            _id = id,
            coord = Coord(lat, lon)
        )
    }
}