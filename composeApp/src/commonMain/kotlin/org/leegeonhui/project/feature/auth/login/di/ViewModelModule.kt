package org.leegeonhui.project.feature.auth.login.di

import org.koin.compose.viewmodel.dsl.viewModel
import org.koin.dsl.module
import org.leegeonhui.project.feature.auth.login.LoginViewModel

val loginViewModelModule = module {
    viewModel { LoginViewModel() }
}