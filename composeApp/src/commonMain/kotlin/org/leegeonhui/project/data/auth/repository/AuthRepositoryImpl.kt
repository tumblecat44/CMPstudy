package org.leegeonhui.project.data.auth.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.leegeonhui.project.data.auth.AuthRepository
import org.leegeonhui.project.network.auth.login.datasource.LoginDataSource
import org.leegeonhui.project.network.auth.login.model.request.LoginRequest
import org.leegeonhui.project.network.auth.login.model.response.LoginResponse
import org.leegeonhui.project.network.auth.register.request.RegisterRequest
import org.leegeonhui.project.network.base.BaseResponse

class AuthRepositoryImpl(
//    private val loginDataSource:
//    LoginDataSource
) : AuthRepository{

    override suspend fun login(body: LoginRequest): Flow<Result<LoginResponse>> {
        return flow{
//            emit()
        }
    }

    override suspend fun register(body: RegisterRequest): Flow<Result<BaseResponse>> {
        TODO("Not yet implemented")
    }
}