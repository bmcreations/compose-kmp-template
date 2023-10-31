package dev.bmcreations.template.inject

import cafe.adriel.voyager.core.model.ScreenModel
import dev.bmcreations.template.screens.home.HomeViewModel
import me.tatarka.inject.annotations.Component

@Component
abstract class ViewModelComponent: AppComponent() {
    abstract val homeViewModel: HomeViewModel

    inline fun <reified T: ScreenModel> getViewModel(): ScreenModel {
        return when (val clazz = T::class) {
            HomeViewModel::class -> homeViewModel
            else -> throw NoSuchElementException("No viewModel found for ${clazz.simpleName}")
        }
    }
}