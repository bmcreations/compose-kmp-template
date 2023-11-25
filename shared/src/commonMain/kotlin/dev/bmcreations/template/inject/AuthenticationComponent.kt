package dev.bmcreations.template.inject

import dev.bmcreations.template.domain.authentication.AuthServiceProvider
import dev.bmcreations.template.domain.authentication.firebase.FirebaseAuthProvider
import me.tatarka.inject.annotations.Provides

interface AuthenticationComponent : FirebaseComponent {
    @Provides
    fun FirebaseAuthProvider.bind(): AuthServiceProvider = this
}