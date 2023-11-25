package dev.bmcreations.template.domain.authentication.firebase

interface GoogleIdProvider {
    fun googleWebClientId(): String
    fun googleAccessToken(): String
}