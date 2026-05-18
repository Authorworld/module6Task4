package com.example.module6task4.routing.prizes

import com.example.module6task4.domain.usecase.GetAllPrizesUseCase
import com.example.module6task4.domain.usecase.GetLaureatesUseCase
import com.example.module6task4.domain.usecase.GetPrizeDetailUseCase
import com.example.module6task4.presentation.prizes.handleGetAllPrizes
import com.example.module6task4.presentation.prizes.handleGetLaureates
import com.example.module6task4.presentation.prizes.handleGetPrizeDetail
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Application.prizeRoutes() {
    val getAllPrizes by inject<GetAllPrizesUseCase>()
    val getPrizeDetail by inject<GetPrizeDetailUseCase>()
    val getLaureates by inject<GetLaureatesUseCase>()

    routing {
        authenticate("auth-jwt") {
            route("/prizes") {
                get {
                    handleGetAllPrizes(getAllPrizes)
                }
                get("/{year}/{category}") {
                    handleGetPrizeDetail(getPrizeDetail)
                }
                get("/{year}/{category}/laureates") {
                    handleGetLaureates(getLaureates)
                }
            }
        }
    }
}