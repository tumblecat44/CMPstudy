package org.leegeonhui.project

import android.app.Application
import org.koin.android.ext.koin.androidContext

class MyApplication: Application() {
    override fun onCreate() {
        initKoin{
            androidContext(this@MyApplication)
        }
        super.onCreate()
    }
}