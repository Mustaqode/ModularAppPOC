package dev.mustaq.auth.presentation.login

import androidx.lifecycle.viewModelScope
import dev.mustaq.auth.domain.repository.AuthRepository
import dev.mustaq.auth.helper.handleResponse
import dev.mustaq.auth.presentation.base.BaseViewModel
import kotlinx.coroutines.launch

/**
 * Created by Mustaq Sameer on 31/07/20
 */

class LoginViewModel(private val authRepository: AuthRepository) : BaseViewModel() {


    fun login(userName: String?, password: String?) {
        viewModelScope.launch(exceptionHandler) {
            if (!userName.isNullOrEmpty() && !password.isNullOrEmpty()) {
                authRepository.login(userName, password).handleResponse {
                    authRepository.saveUserToDatabase(this)
                }
            }
        }
    }

}