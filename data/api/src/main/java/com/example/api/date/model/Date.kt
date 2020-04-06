package com.example.api.date.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class Date(
    @Json(name = "id")
    val id: Int,
    @Json(name = "label")
    val label: String
)