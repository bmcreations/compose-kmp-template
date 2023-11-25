package dev.bmcreations.template.inject

import dev.bmcreations.template.utils.DefaultDispatchers
import dev.bmcreations.template.utils.DispatcherProvider
import me.tatarka.inject.annotations.Component
import me.tatarka.inject.annotations.Provides

@Component
@ScreenModelScope
abstract class DataComponent {
    @Provides
    fun providerDefaultDispatcher(): DispatcherProvider = DefaultDispatchers()
}