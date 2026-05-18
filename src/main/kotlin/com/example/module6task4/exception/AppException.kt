package com.example.module6task4.exception

sealed class AppException(override val message: String) : Exception(message) {
    class UnauthorizedException(msg: String = "Неверный логин или пароль") : AppException(msg)
    class NotFoundException(msg: String = "Ресурс не найден") : AppException(msg)
    class BadRequestException(msg: String = "Некорректный запрос") : AppException(msg)
}