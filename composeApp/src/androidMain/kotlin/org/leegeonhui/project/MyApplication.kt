package org.leegeonhui.project

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
//import org.leegeonhui.project.data.auth.di.loginRepositoryModule
import org.leegeonhui.project.feature.auth.login.di.loginViewModelModule

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin(
            listOf(
//                loginRepositoryModule,
                loginViewModelModule,
//                org.leegeonhui.project.network.auth.login.di.loginViewModelModule
            )
        )
    }
}