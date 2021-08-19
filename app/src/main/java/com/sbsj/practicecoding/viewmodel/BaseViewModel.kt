package com.sbsj.practicecoding.viewmodel

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sbsj.practicecoding.MyApplication
import com.sbsj.practicecoding.model.User
import com.sbsj.practicecoding.model.UserDatabase
import com.sbsj.practicecoding.usecase.UserUseCase
import kotlinx.coroutines.*
import org.koin.experimental.property.inject


open class BaseViewModel(private val userUseCase : UserUseCase): ViewModel() {

     private val _userLiveData: MutableLiveData<ArrayList<User>> = MutableLiveData()
     val userLiveData: LiveData<ArrayList<User>> get() = _userLiveData


     fun searchClick() =viewModelScope.launch {
          userUseCase.getRecord()?.let {
               when(it)
               {
                    is List<*> -> _userLiveData.value = ArrayList(it as List<User>)
                    else -> _userLiveData.value = ArrayList()
               }
          }
     }
}



