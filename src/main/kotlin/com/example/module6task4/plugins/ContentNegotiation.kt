package com.example.module6task4.plugins

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import kotlinx.serialization.json.Json

fun Application.configureContentNegotiation() {
    install(ContentNegotiation) {
        json(Json {
            prettyPrint        = true
            ignoreUnknownKeys  = true
            isLenient          = true
        })
    }
}