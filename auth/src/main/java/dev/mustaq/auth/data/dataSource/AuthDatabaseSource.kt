package dev.mustaq.auth.data.dataSource

import dev.mustaq.auth.domain.models.User

/**
 * Created by Mustaq Sameer on 31/07/20
 */
interface AuthDatabaseSource {

    fun saveUserToDb(user: User)

}