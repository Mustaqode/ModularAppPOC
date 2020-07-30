package dev.mustaq.auth.data.repository

import dev.mustaq.auth.data.dataSource.AuthDataSource
import dev.mustaq.auth.data.dataSource.AuthDatabaseSource
import dev.mustaq.auth.domain.repository.AuthRepository
import dev.mustaq.auth.domain.models.User
import dev.mustaq.auth.helper.ResponseWrapper
import java.lang.Exception

/**
 * Created by Mustaq Sameer on 31/07/20
 */
class AuthRepositoryImpl(
    private val authDataSource: AuthDataSource,
    private val authDatabaseSource: AuthDatabaseSource
) : AuthRepository {

    override suspend fun login(
        userName: String,
        password: String
    ): ResponseWrapper<User, Exception> =
        authDataSource.login(userName, password)

    override fun saveUserToDatabase(user: User) {
        authDatabaseSource.saveUserToDb(user)
    }
}