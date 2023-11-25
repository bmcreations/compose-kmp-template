package dev.bmcreations.template.inject

import dev.bmcreations.template.domain.authentication.firebase.GoogleIdProvider
import dev.bmcreations.template.domain.authentication.firebase.IOSGoogleIdProvider
import me.tatarka.inject.annotations.Component
import me.tatarka.inject.annotations.Provides

@AppScope
@Component
actual abstract class ApplicationComponent : AuthenticationComponent {
    @Provides
    fun IOSGoogleIdProvider.bind(): GoogleIdProvider = this
}
