package com.example.module6task4.routing.auth

import com.example.module6task4.presentation.auth.handleLogin
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.authRoutes() {
    routing {
        route("/auth") {
            post("/login") { handleLogin() }
        }
    }
}