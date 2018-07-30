package com.hrain.test

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity

abstract class BaseActivity :  DaggerAppCompatActivity() {

    protected val TAG = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())

        afterOnCreate()
    }

    override fun onStart() {
        super.onStart()
        doOnStart()
    }

    override fun onDestroy() {
        doOnDestroy()
        super.onDestroy()
    }

    abstract fun doOnStart()

    abstract fun doOnDestroy()

    abstract fun getLayoutId():Int

    abstract fun afterOnCreate()
}
