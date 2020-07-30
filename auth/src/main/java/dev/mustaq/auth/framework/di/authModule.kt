package dev.mustaq.auth.framework.di

import dev.mustaq.auth.data.dataSource.AuthDataSource
import dev.mustaq.auth.data.repository.AuthRepositoryImpl
import dev.mustaq.auth.domain.repository.AuthRepository
import dev.mustaq.auth.framework.network.AuthDataSourceImpl
import dev.mustaq.auth.presentation.login.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by Mustaq Sameer on 31/07/20
 */

val authViewModelModule = module {
    viewModel { LoginViewModel(get()) }
}

val authDataSourceModule = module {
    factory<AuthDataSource> { AuthDataSourceImpl(get()) }
}

val authRepositoryModule = module {
    factory<AuthRepository> { AuthRepositoryImpl(get(), get()) }
}


