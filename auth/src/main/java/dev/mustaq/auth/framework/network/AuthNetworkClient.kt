package dev.mustaq.auth.framework.network

import dev.mustaq.auth.helper.ResponseWrapper

/**
 * Created by Mustaq Sameer on 31/07/20
 */
interface AuthNetworkClient {

    fun makeAuthNetworkCall() : Boolean

}