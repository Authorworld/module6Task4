package com.example.module6task4.data.repository

import com.example.module6task4.data.datasource.NobelPrizeDataSource
import com.example.module6task4.domain.model.Laureate
import com.example.module6task4.domain.model.NobelPrize
import com.example.module6task4.domain.repository.PrizeRepository

class PrizeRepositoryImpl : PrizeRepository {

    private val data: List<NobelPrize> = NobelPrizeDataSource.prizes

    override fun getAllPrizes(): List<NobelPrize> = data

    override fun getPrize(year: Int, category: String): NobelPrize? =
        data.find { it.year == year && it.category.equals(category, ignoreCase = true) }

    override fun getLaureates(year: Int, category: String): List<Laureate>? =
        getPrize(year, category)?.laureates
}