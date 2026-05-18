package com.example.module6task4.domain.usecase

import com.example.module6task4.domain.model.Laureate
import com.example.module6task4.domain.repository.PrizeRepository
import com.example.module6task4.exception.AppException

class GetLaureatesUseCase(private val repository: PrizeRepository) {
    operator fun invoke(year: Int, category: String): List<Laureate> {
        return repository.getLaureates(year, category)
            ?: throw AppException.NotFoundException(
                "Лауреаты для '$category' за $year год не найдены"
            )
    }
}