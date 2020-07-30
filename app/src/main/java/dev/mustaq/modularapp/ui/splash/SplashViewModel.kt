package dev.mustaq.modularapp.ui.splash

import android.os.Handler
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dev.mustaq.modularapp.navigation.ActivityNavigation
import dev.mustaq.modularapp.ui.BaseViewModel

/**
 * Created by Mustaq Sameer on 31/07/20
 */

class SplashViewModel : BaseViewModel() {

    init {
        Handler().postDelayed({
            navigationLd.value = ActivityNavigation.authActivity
        }, 2000)
    }

    companion object {
        const val REQ_CODE_AUTH = 1001
    }
}