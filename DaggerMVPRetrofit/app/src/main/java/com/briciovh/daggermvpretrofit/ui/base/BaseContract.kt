package com.briciovh.daggermvpretrofit.ui.base

interface BaseContract {

    interface Presenter<in T> {
        fun subscribe()
        fun unsubscribe()
        fun attach(view:T)
    }

    interface View {

    }
}