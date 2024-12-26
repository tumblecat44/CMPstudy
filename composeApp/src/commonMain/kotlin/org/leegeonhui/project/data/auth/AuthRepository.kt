package org.leegeonhui.project.data.auth

import kotlinx.coroutines.flow.Flow
import org.leegeonhui.project.network.auth.login.model.request.LoginRequest
import org.leegeonhui.project.network.auth.login.model.response.LoginResponse
import org.leegeonhui.project.network.auth.register.request.RegisterRequest
import org.leegeonhui.project.network.base.BaseResponse

interface AuthRepository {
    suspend fun login(body: LoginRequest) : Flow<Result<LoginResponse>>

    suspend fun register(body: RegisterRequest) : Flow<Result<BaseResponse>>
}