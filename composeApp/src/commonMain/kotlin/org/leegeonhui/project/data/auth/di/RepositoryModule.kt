package org.leegeonhui.project.data.auth.di

import org.koin.dsl.module
import org.leegeonhui.project.data.auth.AuthRepository
import org.leegeonhui.project.data.auth.impl.AuthRepositoryImpl


val loginRepositoryModule = module {
    single<AuthRepository> {
        AuthRepositoryImpl(get())
    }
}