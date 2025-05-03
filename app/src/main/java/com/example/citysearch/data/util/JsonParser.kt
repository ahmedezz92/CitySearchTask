package com.example.citysearch.data.util

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import javax.inject.Inject

class JsonParser @Inject constructor() {
    val json = Json {
        ignoreUnknownKeys = true
        isLenient = true
    }

    inline fun <reified T> fromJson(jsonString: String): T {
        return json.decodeFromString(jsonString)
    }
}