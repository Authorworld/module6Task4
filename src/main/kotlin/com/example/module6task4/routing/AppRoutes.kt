package com.example.module6task4.routing

import com.example.module6task4.routing.auth.authRoutes
import com.example.module6task4.routing.prizes.prizeRoutes
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    authRoutes()
    prizeRoutes()

    routing {
        get("/") {
            call.respond(HttpStatusCode.OK, mapOf(
                "status"  to "OK",
                "service" to "Nobel Prize API",
                "version" to "1.0.0"
            ))
        }
    }
}