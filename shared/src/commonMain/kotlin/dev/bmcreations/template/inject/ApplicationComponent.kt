package dev.bmcreations.template.inject

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf

expect abstract class ApplicationComponent : AuthenticationComponent

val LocalAppComponent: ProvidableCompositionLocal<ApplicationComponent> =
    staticCompositionLocalOf { error("ApplicationComponent not initialized") }