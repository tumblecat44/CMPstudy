package org.leegeonhui.project

import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.KoinAppDeclaration
import org.leegeonhui.project.data.auth.di.loginRepositoryModule
import org.leegeonhui.project.feature.auth.login.di.loginViewModelModule
import org.leegeonhui.project.network.auth.login.di.loginDataSourceModule

fun initKoin(
//    block: KoinApplication.() -> Unit = {}
) {
    startKoin {
        modules(
            loginRepositoryModule,
            loginViewModelModule,
            loginDataSourceModule
        )
//        block()
    }
}