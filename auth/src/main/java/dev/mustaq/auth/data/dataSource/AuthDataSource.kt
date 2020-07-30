package dev.mustaq.auth.data.dataSource

import dev.mustaq.auth.domain.models.User
import dev.mustaq.auth.helper.ResponseWrapper
import java.lang.Exception

/**
 * Created by Mustaq Sameer on 31/07/20
 */
interface AuthDataSource {

    suspend fun login(userName: String, password: String) : ResponseWrapper<User, Exception>

}