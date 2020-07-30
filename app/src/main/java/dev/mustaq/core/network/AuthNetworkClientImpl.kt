package dev.mustaq.core.network

import dev.mustaq.auth.framework.network.AuthNetworkClient

/**
 * Created by Mustaq Sameer on 31/07/20
 */

class AuthNetworkClientImpl(private val networkClient: FakeNetworkClient) : AuthNetworkClient {

    override fun makeAuthNetworkCall(): Boolean =
        networkClient.makeNetworkCall()

}