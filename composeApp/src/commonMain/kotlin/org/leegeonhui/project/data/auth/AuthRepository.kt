package org.leegeonhui.project.data.auth

import org.leegeonhui.project.network.auth.login.request.LoginRequest
import org.leegeonhui.project.network.auth.login.response.LoginResponse
import org.leegeonhui.project.network.auth.register.request.RegisterRequest
import org.leegeonhui.project.network.base.BaseResponse

interface AuthRepository {
    suspend fun login(body: LoginRequest) : LoginResponse
    suspend fun register(body: RegisterRequest) : BaseResponse
}