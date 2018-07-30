package com.example.daggermvp.di

import android.app.Application
import com.example.daggermvp.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class,
    AndroidInjectionModule::class,
    ActivityBindModule::class,
    AndroidSupportInjectionModule::class])
interface AppComponent : AndroidInjector<App> {

//    fun inject(app: Application)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): AppComponent.Builder

        fun build(): AppComponent
    }
}
