package com.hrain.test

interface BasePresenter<T> {

    var mView:T?

    fun takeView(view: T?) {
        mView = view
    }

    fun dropView() {
        mView = null
    }
}