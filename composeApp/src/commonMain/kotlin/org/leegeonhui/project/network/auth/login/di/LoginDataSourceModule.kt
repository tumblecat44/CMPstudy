package org.leegeonhui.project.network.auth.login.di

import org.koin.compose.viewmodel.dsl.viewModel
import org.koin.dsl.module
import org.leegeonhui.project.feature.auth.login.LoginViewModel
import org.leegeonhui.project.network.auth.login.datasource.LoginDataSource

val loginViewModelModule = module {
//    viewModel { LoginDataSource() }
}