package dev.mustaq.modularapp.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dev.mustaq.modularapp.navigation.ActivityNavigation
import dev.mustaq.modularapp.ui.BaseViewModel

/**
 * Created by Mustaq Sameer on 31/07/20
 */
class MainViewModel : BaseViewModel() {

    fun authSuccess() {
        navigationLd.value = ActivityNavigation.walletActivity
    }

}