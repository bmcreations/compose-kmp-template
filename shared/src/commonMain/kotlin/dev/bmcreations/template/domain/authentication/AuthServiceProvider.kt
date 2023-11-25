package dev.bmcreations.template.domain.authentication

import dev.bmcreations.template.data.User

interface AuthServiceProvider {
    suspend fun loginWith(type: LoginType): Result<User>
    suspend fun logout(): Result<Unit>
}

sealed interface LoginType {
    data class Email(val email: String, val password: String): LoginType
//    data object Apple: LoginType
//    data object Google: LoginType
}