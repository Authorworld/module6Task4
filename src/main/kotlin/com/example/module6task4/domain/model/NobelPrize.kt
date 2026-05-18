package com.example.module6task4.domain.model

data class NobelPrize(
    val year: Int,
    val category: String,           // physics, chemistry, literature, peace, medicine, economics
    val laureates: List<Laureate>
)