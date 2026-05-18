package com.example.module6task4.domain.model

data class Laureate(
    val id: String,
    val fullName: String,
    val motivation: String,
    val share: Int,
    val birthCountry: String?,
    val birthDate: String?
)