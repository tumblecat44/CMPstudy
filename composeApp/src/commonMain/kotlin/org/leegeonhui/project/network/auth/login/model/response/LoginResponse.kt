package org.leegeonhui.project.network.auth.login.model.response


data class LoginResponse(
    val status: Int,
    val state: String,
    val message: String,
    val data: LoginData,
)
