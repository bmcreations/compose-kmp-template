package dev.bmcreations.template.inject

import android.content.Context
import dev.bmcreations.template.domain.authentication.firebase.AndroidGoogleIdProvider
import dev.bmcreations.template.domain.authentication.firebase.GoogleIdProvider
import me.tatarka.inject.annotations.Component
import me.tatarka.inject.annotations.Provides

@AppScope
@Component
actual abstract class ApplicationComponent(
    @get:Provides val context: Context
): AuthenticationComponent {
    @Provides
    fun AndroidGoogleIdProvider.bind(): GoogleIdProvider = this
}