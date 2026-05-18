package com.example.module6task4.di

import com.example.module6task4.data.repository.PrizeRepositoryImpl
import com.example.module6task4.domain.repository.PrizeRepository
import com.example.module6task4.domain.usecase.GetAllPrizesUseCase
import com.example.module6task4.domain.usecase.GetLaureatesUseCase
import com.example.module6task4.domain.usecase.GetPrizeDetailUseCase
import org.koin.dsl.module

val appModule = module {
    // Repository
    single<PrizeRepository> { PrizeRepositoryImpl() }

    // UseCases
    single { GetAllPrizesUseCase(get()) }
    single { GetPrizeDetailUseCase(get()) }
    single { GetLaureatesUseCase(get()) }
}