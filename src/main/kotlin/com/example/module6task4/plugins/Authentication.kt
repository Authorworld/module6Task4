package com.example.module6task4.plugins

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import com.example.module6task4.security.JwtConfig
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.auth.jwt.*

fun Application.configureAuthentication() {
    install(Authentication) {
        jwt("auth-jwt") {
            realm     = JwtConfig.REALM
            verifier(JwtConfig.verifier())
            validate { credential ->
                if (credential.payload.getClaim("username").asString().isNotEmpty()) {
                    JWTPrincipal(credential.payload)
                } else null
            }
        }
    }
}