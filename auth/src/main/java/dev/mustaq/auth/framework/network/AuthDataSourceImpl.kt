package dev.mustaq.auth.framework.network

import dev.mustaq.auth.data.dataSource.AuthDataSource
import dev.mustaq.auth.domain.models.User
import dev.mustaq.auth.helper.ResponseWrapper
import kotlinx.coroutines.delay
import java.lang.Exception

/**
 * Created by Mustaq Sameer on 31/07/20
 */
class AuthDataSourceImpl(private val clientAuth: AuthNetworkClient) : AuthDataSource {

    fun fakeUser() = User(
        "Sam",
        25,
        2170.0
    )

    override suspend fun login(
        userName: String,
        password: String
    ): ResponseWrapper<User, Exception> {
        //Fake long-running operation
        delay(2000)
        val response = clientAuth.makeAuthNetworkCall()
        return if (response) ResponseWrapper.build {
            fakeUser()
        } else ResponseWrapper.Error(Exception("Auth token expiry"))
    }
}
