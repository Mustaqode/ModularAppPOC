package dev.mustaq.modularapp.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import dev.mustaq.modularapp.R
import dev.mustaq.modularapp.navigation.ActivityNavigation
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupUi()
    }

    private fun setupUi() {
        mainViewModel.navigation.observe(this, Observer {
            navigate(it)
        })
    }

    private fun navigate(navigation: ActivityNavigation) {
        val intent = Intent().apply {
            setClassName(this@MainActivity, navigation.clazz)
        }
        startActivity(intent)
    }

}