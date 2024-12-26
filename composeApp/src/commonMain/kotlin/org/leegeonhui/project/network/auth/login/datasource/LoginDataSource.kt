package org.leegeonhui.project.network.auth.login.datasource

import org.leegeonhui.project.network.auth.login.model.request.LoginRequest
import org.leegeonhui.project.network.auth.login.model.response.LoginResponse

interface LoginDataSource {
    suspend fun login(body: LoginRequest): LoginResponse
}