package dev.bmcreations.template.navigation

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.registry.ScreenProvider
import cafe.adriel.voyager.core.screen.Screen
import dev.bmcreations.template.screens.home.Render

sealed interface Screens: ScreenProvider {
    object Home : Screen {

        @Composable
        override fun Content() {
            Screens.Home.Render()
        }
    }
}