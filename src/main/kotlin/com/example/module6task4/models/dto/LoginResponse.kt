package com.example.module6task4.models.dto

import kotlinx.serialization.Serializable

@Serializable
data class LoginResponse(val token: String)