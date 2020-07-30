package dev.mustaq.modularapp.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import dev.mustaq.modularapp.R
import dev.mustaq.modularapp.navigation.ActivityNavigation
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * Created by Mustaq Sameer on 31/07/20
 */
class SplashActivty : AppCompatActivity() {

    private val splashViewModel: SplashViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        setupUi()
    }

    private fun setupUi() {
        splashViewModel.navigation.observe(this, Observer {
            navigate(it)
        })
    }

    private fun navigate(navigation: ActivityNavigation) {
        val intent = Intent().apply {
            setClassName(this@SplashActivty, navigation.clazz)
        }
        startActivity(intent)
        finish()
    }
}