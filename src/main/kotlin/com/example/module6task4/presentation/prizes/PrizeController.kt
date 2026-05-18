package com.example.module6task4.presentation.prizes

import com.example.module6task4.domain.usecase.GetAllPrizesUseCase
import com.example.module6task4.domain.usecase.GetLaureatesUseCase
import com.example.module6task4.domain.usecase.GetPrizeDetailUseCase
import com.example.module6task4.exception.AppException
import com.example.module6task4.models.dto.toResponse
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

suspend fun RoutingContext.handleGetAllPrizes(useCase: GetAllPrizesUseCase) {
    val prizes = useCase().map { it.toResponse() }
    call.respond(HttpStatusCode.OK, prizes)
}

suspend fun RoutingContext.handleGetPrizeDetail(useCase: GetPrizeDetailUseCase) {
    val year     = call.parameters["year"]?.toIntOrNull()
        ?: throw AppException.BadRequestException("Год должен быть числом")
    val category = call.parameters["category"]
        ?: throw AppException.BadRequestException("Категория обязательна")

    val prize = useCase(year, category)
    call.respond(HttpStatusCode.OK, prize.toResponse())
}

suspend fun RoutingContext.handleGetLaureates(useCase: GetLaureatesUseCase) {
    val year     = call.parameters["year"]?.toIntOrNull()
        ?: throw AppException.BadRequestException("Год должен быть числом")
    val category = call.parameters["category"]
        ?: throw AppException.BadRequestException("Категория обязательна")

    val laureates = useCase(year, category).map { it.toResponse() }
    call.respond(HttpStatusCode.OK, laureates)
}