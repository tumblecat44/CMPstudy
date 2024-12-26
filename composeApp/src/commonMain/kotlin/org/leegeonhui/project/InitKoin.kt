package org.leegeonhui.project

import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.leegeonhui.project.feature.auth.login.di.loginViewModelModule

fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this)
        modules(loginViewModelModule)
    }
}