package dev.mustaq.core.db

import dev.mustaq.auth.data.dataSource.AuthDatabaseSource
import dev.mustaq.auth.domain.models.User

/**
 * Created by Mustaq Sameer on 31/07/20
 */
class AuthDataBaseSourceImpl(private val fakeRealmDbManager: FakeRealmDbManager) : AuthDatabaseSource {

    override fun saveUserToDb(user: User) {
        fakeRealmDbManager.saveUserToDb(user)
    }
}