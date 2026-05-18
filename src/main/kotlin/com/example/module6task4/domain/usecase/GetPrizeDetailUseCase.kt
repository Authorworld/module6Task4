package com.example.module6task4.domain.usecase

import com.example.module6task4.domain.model.NobelPrize
import com.example.module6task4.domain.repository.PrizeRepository
import com.example.module6task4.exception.AppException

class GetPrizeDetailUseCase(private val repository: PrizeRepository) {
    operator fun invoke(year: Int, category: String): NobelPrize {
        return repository.getPrize(year, category)
            ?: throw AppException.NotFoundException(
                "Премия по категории '$category' за $year год не найдена"
            )
    }
}