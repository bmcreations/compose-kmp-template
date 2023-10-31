package dev.bmcreations.template.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import platform.UIKit.UIContentSizeCategoryAccessibilityExtraExtraExtraLarge
import platform.UIKit.UIContentSizeCategoryAccessibilityExtraExtraLarge
import platform.UIKit.UIContentSizeCategoryAccessibilityExtraLarge
import platform.UIKit.UIContentSizeCategoryAccessibilityLarge
import platform.UIKit.UIContentSizeCategoryAccessibilityMedium
import platform.UIKit.UIContentSizeCategoryExtraExtraExtraLarge
import platform.UIKit.UIContentSizeCategoryExtraExtraLarge
import platform.UIKit.UIContentSizeCategoryExtraLarge
import platform.UIKit.UIContentSizeCategoryExtraSmall
import platform.UIKit.UIContentSizeCategoryLarge
import platform.UIKit.UIContentSizeCategoryMedium
import platform.UIKit.UIContentSizeCategorySmall

actual fun getPlatformName(): String = "iOS"


actual val Platform.usesCloseAffordanceOnSheets: Boolean
    get() = true


private val uiContentSizeCategoryToFontScaleMap = mapOf(
    UIContentSizeCategoryExtraSmall to 0.9f,
    UIContentSizeCategorySmall to 0.95f,
    UIContentSizeCategoryMedium to 1.0f,
    UIContentSizeCategoryLarge to 1.05f,
    UIContentSizeCategoryExtraLarge to 1.1f,
    UIContentSizeCategoryExtraExtraLarge to 1.15f,
    UIContentSizeCategoryExtraExtraExtraLarge to 1.2f,

    UIContentSizeCategoryAccessibilityMedium to 1.3f,
    UIContentSizeCategoryAccessibilityLarge to 1.4f,
    UIContentSizeCategoryAccessibilityExtraLarge to 1.5f,
    UIContentSizeCategoryAccessibilityExtraExtraLarge to 1.6f,
    UIContentSizeCategoryAccessibilityExtraExtraExtraLarge to 1.7f,

    // UIContentSizeCategoryUnspecified
)
actual val Platform.fontScale: Float
    @Composable get() {
        return LocalDensity.current.fontScale
    }

