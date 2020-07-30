package dev.mustaq.auth.helper


/**
 * Created by Mustaq Sameer on 31/07/20
 */

inline fun <V, E : Exception> ResponseWrapper<V, E>.handleResponse(
    noinline error: (E.() -> Unit)? = null,
    result: V.() -> Unit
) {
    when (this) {
        is ResponseWrapper.Value -> result.invoke(this.value)
        is ResponseWrapper.Error -> {
            error?.invoke(this.error)
            throw this.error
        }
    }
}
