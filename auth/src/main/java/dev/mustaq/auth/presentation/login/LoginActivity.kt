package dev.mustaq.auth.presentation.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.mustaq.auth.R
import kotlinx.android.synthetic.main.activity_login.*
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * Created by Mustaq Sameer on 31/07/20
 */

class LoginActivity : AppCompatActivity() {

    private val loginViewModel: LoginViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setupUi()
        setListeners()
    }

    private fun setupUi() {

    }

    private fun setListeners() {
        uiBtnLogin.setOnClickListener {
            loginViewModel.login(uiEtUserName.text.toString(), uiEtPassword.text.toString())
        }
    }
}