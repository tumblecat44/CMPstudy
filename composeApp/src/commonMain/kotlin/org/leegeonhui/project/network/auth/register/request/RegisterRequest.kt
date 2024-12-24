package org.leegeonhui.project.network.auth.register.request

data class RegisterRequest(
    val email: String,
    val name: String,
    val password: String,
    val authCode: String
)
