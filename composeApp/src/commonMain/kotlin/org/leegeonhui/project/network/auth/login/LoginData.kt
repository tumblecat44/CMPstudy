package org.leegeonhui.project.network.auth.login

data class LoginData(
    val accessToken: String,
    val refreshToken: String,
    val username: String
)
