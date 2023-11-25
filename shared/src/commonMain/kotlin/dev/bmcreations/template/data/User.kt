package dev.bmcreations.template.data

import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable

@Serializable
data class User(
    val uid: String,
    val displayName : String?,
    val email: String?,
    val phoneNumber: String?,
    val photoUri: String?,
    val createdAt: Instant,
)
