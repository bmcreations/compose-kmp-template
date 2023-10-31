package dev.bmcreations.template.utils

expect fun getPlatformName(): String

object Platform
expect val Platform.usesCloseAffordanceOnSheets: Boolean
expect val Platform.fontScale: Float