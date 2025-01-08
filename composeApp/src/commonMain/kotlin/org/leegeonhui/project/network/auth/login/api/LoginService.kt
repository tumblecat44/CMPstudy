package org.leegeonhui.project.network.auth.login.api

import org.leegeonhui.project.network.auth.login.datasource.LoginDataSource
import org.leegeonhui.project.network.auth.login.model.request.LoginRequest
import org.leegeonhui.project.network.auth.login.model.response.LoginData
import org.leegeonhui.project.network.auth.login.model.response.LoginResponse

internal class LoginService(
//    private val client:
) : LoginDataSource{
    override suspend fun login(body: LoginRequest): LoginResponse {
        return LoginResponse(
            status = 400,
            state = "bad",
            message = "좋습니다",
            data = LoginData(
                accessToken = "엑세스",
                refreshToken = "리프레쉬",
                username = "이건희"
            )

        )
    }
}