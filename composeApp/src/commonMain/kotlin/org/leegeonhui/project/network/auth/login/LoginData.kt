package org.leegeonhui.project.network.auth.login

data class wLoginData(
    val accessToken: String,
    val refreshToken: String,
    val username: String
)
