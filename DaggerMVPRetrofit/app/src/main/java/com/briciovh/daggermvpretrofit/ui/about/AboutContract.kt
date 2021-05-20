package com.briciovh.daggermvpretrofit.ui.about

import com.briciovh.daggermvpretrofit.ui.base.BaseContract

class AboutContract {

    interface View: BaseContract.View {
        fun showProgress(show: Boolean)
        fun loadMessageSuccess(message: String)
        // fun loadMessageError() // if it's a real request, this fun should be implemented, too
    }

    interface Presenter: BaseContract.Presenter<View> {
        fun loadMessage() // assume that a retrofit request
    }
}