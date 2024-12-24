package org.leegeonhui.project.data.auth.repository

import org.leegeonhui.project.data.auth.AuthRepository
import org.leegeonhui.project.network.auth.login.request.LoginRequest
import org.leegeonhui.project.network.auth.login.response.LoginResponse
import org.leegeonhui.project.network.auth.register.request.RegisterRequest
import org.leegeonhui.project.network.base.BaseResponse

class AuthRepositoryImpl : AuthRepository{
    override suspend fun login(body: LoginRequest): LoginResponse {
        TODO("Not yet implemented")

    }

    override suspend fun register(body: RegisterRequest): BaseResponse {
        TODO("Not yet implemented")
    }
}