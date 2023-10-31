package dev.bmcreations.template.utils.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import dev.bmcreations.template.common.R

@Composable
actual fun font(name: String, res: String, weight: FontWeight, style: FontStyle): Font {
    return Font(resId = R.font.inter, weight = weight, style = style)
}