package com.example.daggermvp.login

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.example.daggermvp.R
import com.hrain.test.BaseActivity
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject

class LoginActivity : BaseActivity(), LoginContract.View {
    override fun afterOnCreate() {
        Log.e(TAG, "${appContext == null}")

        btn1.setOnClickListener {
            presenter.login()
        }
    }

    override fun doOnDestroy() {
        presenter.dropView()
    }

    override fun getLayoutId() = R.layout.activity_login

    override fun doOnStart() {
        presenter.takeView(this)
    }

    @Inject
    lateinit var appContext: Context

    @Inject
    lateinit var presenter: LoginPresenter

    override fun showMsg() {
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show()
    }
}
