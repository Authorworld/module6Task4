package com.example.module6task4.plugins

import com.example.module6task4.exception.AppException
import com.example.module6task4.models.dto.ErrorResponse
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*

fun Application.configureStatusPages() {
    install(StatusPages) {
        exception<AppException.UnauthorizedException> { call, ex ->
            call.respond(HttpStatusCode.Unauthorized, ErrorResponse(ex.message))
        }
        exception<AppException.NotFoundException> { call, ex ->
            call.respond(HttpStatusCode.NotFound, ErrorResponse(ex.message))
        }
        exception<AppException.BadRequestException> { call, ex ->
            call.respond(HttpStatusCode.BadRequest, ErrorResponse(ex.message))
        }
        exception<Throwable> { call, ex ->
            call.respond(
                HttpStatusCode.InternalServerError,
                ErrorResponse("Внутренняя ошибка сервера: ${ex.message}")
            )
        }
        status(HttpStatusCode.Unauthorized) { call, _ ->
            call.respond(HttpStatusCode.Unauthorized, ErrorResponse("Требуется авторизация"))
        }
    }
}