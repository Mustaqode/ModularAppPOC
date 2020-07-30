package dev.mustaq

import android.app.Application
import dev.mustaq.auth.framework.di.authDataSourceModule
import dev.mustaq.auth.framework.di.authRepositoryModule
import dev.mustaq.auth.framework.di.authViewModelModule
import dev.mustaq.core.di.commonModules
import dev.mustaq.core.di.databaseModule
import dev.mustaq.core.di.networkModules
import dev.mustaq.core.di.viewmodeModule
import dev.mustaq.transactions.framework.di.transactionViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * Created by Mustaq Sameer on 31/07/20
 */
class ModularApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        setupKoin()
    }

    private fun setupKoin() {
        startKoin {
            androidContext(this@ModularApplication)
            modules(
               listOf(
                   commonModules,
                   networkModules,
                   databaseModule,
                   viewmodeModule,
                   authViewModelModule,
                   authDataSourceModule,
                   authRepositoryModule,
                   transactionViewModelModule
               )
            )
        }
    }
}