package org.leegeonhui.project

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import org.koin.core.context.startKoin
//import org.leegeonhui.project.data.auth.di.loginRepositoryModule
import org.leegeonhui.project.feature.auth.login.di.loginViewModelModule

fun main() = application {
    startKoin {
        modules(loginViewModelModule)
    }
    Window(
        onCloseRequest = ::exitApplication,
        title = "IamFullStack",
    ) {
        App()
    }
}