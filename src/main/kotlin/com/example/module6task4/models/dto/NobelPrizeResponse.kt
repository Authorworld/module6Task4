package com.example.module6task4.models.dto

import kotlinx.serialization.Serializable
import com.example.module6task4.domain.model.Laureate
import com.example.module6task4.domain.model.NobelPrize

@Serializable
data class LaureatResponse(
    val id: String,
    val fullName: String,
    val motivation: String,
    val share: Int,
    val birthCountry: String?,
    val birthDate: String?
)

@Serializable
data class NobelPrizeResponse(
    val year: Int,
    val category: String,
    val laureates: List<LaureatResponse>
)

// Маппинг domain → DTO
fun Laureate.toResponse() = LaureatResponse(
    id           = id,
    fullName     = fullName,
    motivation   = motivation,
    share        = share,
    birthCountry = birthCountry,
    birthDate    = birthDate
)

fun NobelPrize.toResponse() = NobelPrizeResponse(
    year      = year,
    category  = category,
    laureates = laureates.map { it.toResponse() }
)