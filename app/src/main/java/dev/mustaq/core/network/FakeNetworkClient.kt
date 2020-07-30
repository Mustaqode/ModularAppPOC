package dev.mustaq.core.network

import kotlin.math.roundToInt

/**
 * Created by Mustaq Sameer on 31/07/20
 */
class FakeNetworkClient {

    fun makeNetworkCall() : Boolean {
        val rand = Math.random().roundToInt()
        return rand % 2 == 0
    }
}