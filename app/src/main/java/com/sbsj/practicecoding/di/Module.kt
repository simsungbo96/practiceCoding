package com.sbsj.practicecoding.di


import androidx.room.Room
import com.sbsj.practicecoding.model.UserDatabase
import com.sbsj.practicecoding.viewmodel.BaseViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.experimental.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module{
    viewModel{  BaseViewModel() }
}

val roomModule = module {
    single {
        Room.databaseBuilder(
            androidApplication().applicationContext,
            UserDatabase::class.java,
            "User.db"
        ).build()
    }
}