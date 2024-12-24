package org.leegeonhui.project.network.auth.login.response

import org.leegeonhui.project.network.auth.login.LoginData

data class LoginResponse(
    val status: Int,
    val state: String,
    val message: String,
    val data: LoginData,
)
