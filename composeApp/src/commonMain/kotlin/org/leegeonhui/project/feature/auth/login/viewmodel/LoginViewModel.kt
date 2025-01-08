package org.leegeonhui.project.feature.auth.login.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.leegeonhui.project.data.auth.AuthRepository
import org.leegeonhui.project.data.result.Results
import org.leegeonhui.project.feature.auth.login.model.LoginSideEffect
import org.leegeonhui.project.feature.auth.login.model.LoginState
import org.leegeonhui.project.network.auth.login.model.request.LoginRequest

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
                is Results.Error -> {
                    _uiState.update { it.copy(isLoading = false) }

                    _uiEffect.emit(LoginSideEffect.Failed)
                }
                Results.Loading -> {
                    _uiState.update { it.copy(isLoading = true) }
                }
                is Results.Success -> {
                    _uiState.update { it.copy(isLoading = false) }
                    _uiEffect.emit(LoginSideEffect.Success)
                }
            }
        }
    }
}
