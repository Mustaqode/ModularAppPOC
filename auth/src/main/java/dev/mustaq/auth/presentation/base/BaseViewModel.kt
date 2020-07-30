package dev.mustaq.auth.presentation.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import org.koin.core.KoinComponent

/**
 * Created by Mustaq Sameer on 31/07/20
 */
open class BaseViewModel : ViewModel(), KoinComponent {

    protected val errorLd = MutableLiveData<String>()

    val error: LiveData<String> = errorLd

    protected val exceptionHandler = CoroutineExceptionHandler { _, exception ->
        errorLd.value = exception.localizedMessage
    }
}