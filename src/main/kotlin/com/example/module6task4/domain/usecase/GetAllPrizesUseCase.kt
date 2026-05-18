package com.example.module6task4.domain.usecase

import com.example.module6task4.domain.model.NobelPrize
import com.example.module6task4.domain.repository.PrizeRepository

class GetAllPrizesUseCase(private val repository: PrizeRepository) {
    operator fun invoke(): List<NobelPrize> = repository.getAllPrizes()
}