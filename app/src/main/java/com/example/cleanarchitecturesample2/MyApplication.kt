package com.example.cleanarchitecturesample2

import android.app.Application

class MyApplication : Application() {
    private var instance: MyApplication? = null

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}