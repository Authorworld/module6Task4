package com.example.module6task4.presentation.auth

import com.example.module6task4.exception.AppException
import com.example.module6task4.models.dto.LoginRequest
import com.example.module6task4.models.dto.LoginResponse
import com.example.module6task4.security.JwtConfig
import com.example.module6task4.security.UserCredentials
import io.ktor.http.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

suspend fun RoutingContext.handleLogin() {
    val request = call.receive<LoginRequest>()

    if (!UserCredentials.isValid(request.username, request.password)) {
        throw AppException.UnauthorizedException("Неверный логин или пароль")
    }

    val token = JwtConfig.generateToken(request.username)
    call.respond(HttpStatusCode.OK, LoginResponse(token = token))
}