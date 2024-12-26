package org.leegeonhui.project.feature.auth.login.model

sealed class LoginSideEffect {
    data object Success : LoginSideEffect()
    data object Failed: LoginSideEffect()
}