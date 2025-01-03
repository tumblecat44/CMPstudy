package org.leegeonhui.project.data.auth.impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import org.leegeonhui.project.data.auth.AuthRepository
import org.leegeonhui.project.data.result.Results
import org.leegeonhui.project.data.result.asResult
import org.leegeonhui.project.network.auth.login.datasource.LoginDataSource
import org.leegeonhui.project.network.auth.login.model.request.LoginRequest
import org.leegeonhui.project.network.auth.login.model.response.LoginResponse
import org.leegeonhui.project.network.auth.register.request.RegisterRequest
import org.leegeonhui.project.network.base.BaseResponse


class AuthRepositoryImpl(
    private val loginDataSource: LoginDataSource,
    ) : AuthRepository {

    override suspend fun login(body: LoginRequest): Flow<Results<LoginResponse>> {
        return flow {
            emit(
                loginDataSource.login(body)
            )
        }.asResult().flowOn(Dispatchers.Default)
    }

    override suspend fun register(body: RegisterRequest): Flow<Results<BaseResponse>> {
        TODO("Not yet implemented")
    }
}