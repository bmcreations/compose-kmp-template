package dev.bmcreations.template

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalContext
import dev.bmcreations.template.App
import dev.bmcreations.template.inject.ApplicationComponent
import dev.bmcreations.template.inject.LocalAppComponent
import dev.bmcreations.template.inject.create

@Composable
fun MainView() {
    val appComponent = ApplicationComponent::class.create(LocalContext.current)
    CompositionLocalProvider(LocalAppComponent provides appComponent) {
        App()
    }
}