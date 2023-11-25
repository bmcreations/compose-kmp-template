package dev.bmcreations.template.domain.authentication.firebase

import dev.bmcreations.template.data.User
import dev.bmcreations.template.domain.authentication.AuthServiceProvider
import dev.bmcreations.template.domain.authentication.LoginType
import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.auth.FirebaseAuth
import dev.gitlive.firebase.auth.GoogleAuthProvider
import dev.gitlive.firebase.options
import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import me.tatarka.inject.annotations.Inject
import org.lighthousegames.logging.logging

@Inject
class FirebaseAuthProvider(
    private val firebase: FirebaseAuth,
) : AuthServiceProvider {

    override suspend fun loginWith(type: LoginType): Result<User> {
        return runCatching {
            when (type) {
                is LoginType.Email -> firebase.signInWithEmailAndPassword(type.email, type.password)
            }
        }.map {
            it.user
        }.mapCatching { firebaseUser ->
            firebaseUser?.let {
                User(
                    uid = firebaseUser.uid,
                    displayName = firebaseUser.displayName,
                    email = firebaseUser.email,
                    phoneNumber = firebaseUser.phoneNumber,
                    photoUri = firebaseUser.photoURL,
                    createdAt = firebaseUser.metaData?.creationTime?.toLong()?.let {
                        Instant.fromEpochMilliseconds(it)
                    } ?: Clock.System.now()
                )
            } ?: throw Exception("User was null")
        }
    }

    override suspend fun logout(): Result<Unit> {
        TODO("Not yet implemented")
    }
}