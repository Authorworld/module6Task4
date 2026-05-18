package com.example.module6task4.domain.repository

import com.example.module6task4.domain.model.Laureate
import com.example.module6task4.domain.model.NobelPrize

interface PrizeRepository {
    fun getAllPrizes(): List<NobelPrize>
    fun getPrize(year: Int, category: String): NobelPrize?
    fun getLaureates(year: Int, category: String): List<Laureate>?
}