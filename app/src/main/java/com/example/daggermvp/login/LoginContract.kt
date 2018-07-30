package com.example.daggermvp.login

import com.hrain.test.*

interface LoginContract {

    interface View:BaseView<Presenter> {

        fun showMsg()
    }

    interface Presenter:BasePresenter<View> {
        fun login()
    }
}