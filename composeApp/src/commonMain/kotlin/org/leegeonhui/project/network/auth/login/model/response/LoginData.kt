package org.leegeonhui.project.network.auth.login.model.response

data class LoginData(
    val accessToken: String,
    val refreshToken: String,
    val username: String

)
