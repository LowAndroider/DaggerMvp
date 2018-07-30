package com.example.daggermvp.login

import javax.inject.Inject

class LoginPresenter @Inject constructor() : LoginContract.Presenter {

    override var mView:LoginContract.View? = null

    override fun login() {
        mView?.showMsg()
    }
}