package dev.bmcreations.template

import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.window.ComposeUIViewController
import dev.bmcreations.template.inject.ApplicationComponent
import dev.bmcreations.template.inject.LocalAppComponent
import dev.bmcreations.template.inject.create

fun MainViewController() = ComposeUIViewController {
    val appComponent = ApplicationComponent::class.create()
    CompositionLocalProvider(LocalAppComponent provides appComponent) {
        App()
    }
}

