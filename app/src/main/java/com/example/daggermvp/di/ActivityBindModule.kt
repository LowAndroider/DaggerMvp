package com.example.daggermvp.di

import com.example.daggermvp.login.LoginActivity
import com.example.daggermvp.login.LoginModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [LoginModule::class])
    abstract fun loginActivity(): LoginActivity
}