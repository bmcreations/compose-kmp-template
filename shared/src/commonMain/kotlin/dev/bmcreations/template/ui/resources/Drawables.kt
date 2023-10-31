package dev.bmcreations.template.ui.resources

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@Composable
@OptIn(ExperimentalResourceApi::class)
private fun resourceForName(name: String) = painterResource("drawable/$name.xml")

object Drawables {
    val ComposeMultiplatformLogo: Painter
        @Composable get() = resourceForName("compose-multiplatform")
}