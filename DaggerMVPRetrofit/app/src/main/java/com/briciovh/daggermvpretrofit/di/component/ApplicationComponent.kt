package com.briciovh.daggermvpretrofit.di.component

import com.briciovh.daggermvpretrofit.di.module.ApplicationModule
import dagger.Component

@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun inject(application: BaseApp)

}