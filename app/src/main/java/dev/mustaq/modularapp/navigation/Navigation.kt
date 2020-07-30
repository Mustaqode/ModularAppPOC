package dev.mustaq.modularapp.navigation


/**
 * Created by Mustaq Sameer on 31/07/20
 */

data class ActivityNavigation(
    val clazz: String,
    val requestCode: Int? = null
)  {
    companion object {
        val walletActivity = ActivityNavigation("dev.mustaq.transactions.presentation.wallet.WalletActivity")
        val authActivity = ActivityNavigation("dev.mustaq.auth.presentation.login.LoginActivity")
        val mainActivity = ActivityNavigation("dev.mustaq.modularapp.ui.main.MainActivity")
    }
}