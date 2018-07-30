package com.example.daggermvp.login

import com.example.daggermvp.di.ActivityScope
import dagger.Binds
import dagger.Module

@Module
abstract class LoginModule {

    @ActivityScope
    @Binds
    abstract fun loginPresenter(loginPresenter: LoginPresenter): LoginContract.Presenter
}