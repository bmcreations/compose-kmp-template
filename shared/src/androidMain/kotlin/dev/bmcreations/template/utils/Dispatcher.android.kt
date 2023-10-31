package dev.bmcreations.template.utils

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

class AndroidDispatcher : Dispatcher {
    override fun dispatcher(): CoroutineDispatcher = Dispatchers.IO
}

actual val applicationIoDispatcher: Dispatcher = AndroidDispatcher()