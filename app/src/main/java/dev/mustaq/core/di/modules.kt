package dev.mustaq.core.di

import dev.mustaq.auth.data.dataSource.AuthDatabaseSource
import dev.mustaq.auth.framework.network.AuthNetworkClient
import dev.mustaq.core.db.AuthDataBaseSourceImpl
import dev.mustaq.core.db.FakeRealmDbManager
import dev.mustaq.core.network.AuthNetworkClientImpl
import dev.mustaq.core.network.FakeNetworkClient
import dev.mustaq.modularapp.ui.main.MainViewModel
import dev.mustaq.modularapp.ui.splash.SplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by Mustaq Sameer on 30/07/20
 */

val commonModules = module {
    single { FakeNetworkClient() }
    single { FakeRealmDbManager() }
}

val networkModules = module {
    single<AuthNetworkClient> { AuthNetworkClientImpl(get()) }
}

val databaseModule = module {
    single<AuthDatabaseSource> { AuthDataBaseSourceImpl(get()) }
}

val viewmodeModule = module {
    viewModel { MainViewModel() }
    viewModel { SplashViewModel() }
}

