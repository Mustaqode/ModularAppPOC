package dev.mustaq.modularapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dev.mustaq.modularapp.navigation.ActivityNavigation

/**
 * Created by Mustaq Sameer on 31/07/20
 */
open class BaseViewModel : ViewModel() {

    protected val navigationLd = MutableLiveData<ActivityNavigation>()

    val navigation: LiveData<ActivityNavigation> = navigationLd
}