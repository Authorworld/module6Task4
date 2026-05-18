package com.example.module6task4.models.dto

import kotlinx.serialization.Serializable

@Serializable
data class ErrorResponse(val error: String)