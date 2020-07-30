package dev.mustaq.auth.helper

import java.lang.Exception

/**
 * Created by Mustaq Sameer on 31/07/20
 */

sealed class ResponseWrapper <out V, out E> {

    data class Value <out V> (val value: V) : ResponseWrapper<V, Nothing>()

    data class Error <out E> (val error: E) : ResponseWrapper<Nothing, E>()

    companion object {
        inline fun <V> build( block: () -> V) : ResponseWrapper<V, Exception> {
            return try {
                Value(block.invoke())
            } catch (e: Exception) {
                Error(e)
            }
        }
    }

}

