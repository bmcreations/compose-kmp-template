package dev.bmcreations.template.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.Navigator


@Composable
expect fun AppNavHost(content: @Composable () -> Unit)

expect class PlatformNavigator {
    val isVisible: Boolean
    val progress: Float
    fun show(screen: Screen)
    fun hide()
    fun push(item: Screen)

    fun push(items: List<Screen>)

    fun replace(item: Screen)

    fun replaceAll(item: Screen)

    fun replaceAll(items: List<Screen>)

    fun pop(): Boolean

    fun popAll()

    fun popUntil(predicate: (Screen) -> Boolean): Boolean
}


val LocalPlatformNavigator: ProvidableCompositionLocal<PlatformNavigator> =
    staticCompositionLocalOf { error("PlatformNavigator not initialized") }

@Composable
fun AppNavigation() {
    AppNavHost {
        Navigator(Screens.Home)
    }
}