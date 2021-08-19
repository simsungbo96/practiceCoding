package com.sbsj.practicecoding.usecase

import com.sbsj.practicecoding.model.User
import com.sbsj.practicecoding.repository.UserRepository


class UserUseCase(private val userRepository: UserRepository) {

    suspend fun getRecord() = userRepository.getUserList().run{
        if(this.isNotEmpty())
            this
        else
            "항목이 없습니다."
    }

    suspend fun insertRecord(user: User) = userRepository.insert(user)

    suspend fun deleteAllRecord() = userRepository.deleteAll()
}