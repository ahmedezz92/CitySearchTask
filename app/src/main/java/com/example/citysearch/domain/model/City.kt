package com.example.citysearch.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class City(
    val country: String,
    val name: String,
    val _id: Int,
    val coord: Coord,
)

@Serializable
data class Coord(
    val lon: Double,
    val lat: Double,
)
