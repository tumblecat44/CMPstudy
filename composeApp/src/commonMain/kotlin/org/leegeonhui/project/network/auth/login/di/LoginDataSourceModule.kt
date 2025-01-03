package org.leegeonhui.project.network.auth.login.di

import org.koin.dsl.module
import org.leegeonhui.project.network.auth.login.api.LoginService
import org.leegeonhui.project.network.auth.login.datasource.LoginDataSource


val loginDataSourceModule = module {

    single<LoginDataSource> {
        LoginService()
    }
}