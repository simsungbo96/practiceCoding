package com.sbsj.practicecoding

import android.app.Application
import com.sbsj.practicecoding.di.roomModule
import com.sbsj.practicecoding.di.viewModelModule

import org.koin.core.context.startKoin
import org.koin.android.ext.koin.androidContext
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@MyApplication)
            modules(viewModelModule , roomModule)
        }
    }
}