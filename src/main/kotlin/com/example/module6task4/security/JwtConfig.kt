package com.example.module6task4.security

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import java.util.Date

object JwtConfig {
    const val SECRET     = "nobel-prize-super-secret-key-12345"  // >= 32 символа
    const val ISSUER     = "module6task4"
    const val AUDIENCE   = "nobel-api-users"
    const val REALM      = "Nobel Prize API"
    const val EXPIRE_MS  = 30 * 60 * 1000L   // 30 минут

    private val algorithm = Algorithm.HMAC256(SECRET)

    fun generateToken(username: String): String {
        return JWT.create()
            .withIssuer(ISSUER)
            .withAudience(AUDIENCE)
            .withSubject(username)
            .withClaim("username", username)
            .withExpiresAt(Date(System.currentTimeMillis() + EXPIRE_MS))
            .sign(algorithm)
    }

    fun verifier() = JWT.require(algorithm)
        .withIssuer(ISSUER)
        .withAudience(AUDIENCE)
        .build()
}

// Хардкод тестовых пользователей (в реальном проекте — база данных)
object UserCredentials {
    private val users = mapOf(
        "admin" to "123",
        "user"  to "pass123"
    )

    fun isValid(username: String, password: String): Boolean =
        users[username] == password
}