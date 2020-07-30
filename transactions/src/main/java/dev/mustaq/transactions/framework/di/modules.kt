package dev.mustaq.transactions.framework.di

import dev.mustaq.transactions.presentation.wallet.WalletViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by Mustaq Sameer on 31/07/20
 */

val transactionViewModelModule = module {
    viewModel { WalletViewModel() }
}