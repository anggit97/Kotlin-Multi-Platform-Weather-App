package com.anggitprayogo.kotlinmultiplatformproject.app.di.viewmodel

import androidx.lifecycle.ViewModel
import com.anggitprayogo.kotlinmultiplatformproject.ui.main.MainViewModel
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap
import kotlin.reflect.KClass

@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
@MapKey
internal annotation class ViewModelKey(val value: KClass<out ViewModel>)

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindLocationViewModel(viewModel: MainViewModel): ViewModel
}