package com.example.module6task4

import com.example.module6task4.di.appModule
import com.example.module6task4.plugins.*
import com.example.module6task4.routing.auth.authRoutes
import com.example.module6task4.routing.prizes.prizeRoutes
import com.example.module6task4.routing.configureRouting
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger

fun main() {
    embeddedServer(
        factory = Netty,
        port    = 8080,
        host    = "0.0.0.0",
        module  = Application::module
    ).start(wait = true)
}

fun Application.module() {
    install(Koin) {
        slf4jLogger()
        modules(appModule)
    }

    configureContentNegotiation()
    configureCallLogging()
    configureCORS()
    configureStatusPages()
    configureAuthentication()

    configureRouting()
    authRoutes()
    prizeRoutes()
}