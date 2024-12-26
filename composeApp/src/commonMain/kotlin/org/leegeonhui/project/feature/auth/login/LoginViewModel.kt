package org.leegeonhui.project.feature.auth.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.leegeonhui.project.data.auth.AuthRepository
import org.leegeonhui.project.data.result.Result
import org.leegeonhui.project.feature.auth.login.model.LoginSideEffect
import org.leegeonhui.project.feature.auth.login.model.LoginState
import org.leegeonhui.project.network.Token
import org.leegeonhui.project.network.auth.login.model.request.LoginRequest
import org.leegeonhui.project.network.auth.login.model.response.LoginResponse
import org.leegeonhui.project.network.test.RoomApi

class LoginViewModel(
) : ViewModel(), KoinComponent {
    private val authRepository : AuthRepository by inject()
    private val _uiState = MutableStateFlow(LoginState())
    val uiState = _uiState.asStateFlow()


    private val _uiEffect = MutableSharedFlow<LoginSideEffect>()
    val uiEffect: SharedFlow<LoginSideEffect> = _uiEffect.asSharedFlow()

    fun login(email: String, password: String) = viewModelScope.launch {
        authRepository.login(LoginRequest(email,password)).collect { result ->
            when (result) {

            }
        }
    }
}
