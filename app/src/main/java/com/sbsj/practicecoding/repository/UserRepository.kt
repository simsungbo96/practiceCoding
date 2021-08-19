package com.sbsj.practicecoding.repository

import com.sbsj.practicecoding.model.User
import com.sbsj.practicecoding.model.UserDatabase

class UserRepository(private val userDatabase: UserDatabase) {

    suspend fun getUserList() = userDatabase.userDao().getAll()

    suspend fun  insert(user : User) = userDatabase.userDao().insertAll(user)

    suspend fun  deleteAll() = userDatabase.userDao().delete()
}