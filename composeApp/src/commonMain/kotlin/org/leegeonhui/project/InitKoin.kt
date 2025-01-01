package org.leegeonhui.project

import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.KoinAppDeclaration
import org.leegeonhui.project.feature.auth.login.di.loginViewModelModule

fun initKoin(appModules: List<Module>) {
    startKoin {
        modules(appModules)
    }
}