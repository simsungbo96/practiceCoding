package com.sbsj.practicecoding.activity

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.sbsj.practicecoding.MyApplication
import com.sbsj.practicecoding.R
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.sbsj.practicecoding.databinding.MainActivityBinding
import com.sbsj.practicecoding.viewmodel.BaseViewModel
import org.koin.android.ext.android.bind


class MainActivity : AppCompatActivity() {

    private val viewModel : BaseViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        val binding =DataBindingUtil.setContentView<MainActivityBinding>(this,R.layout.activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner =this
        binding.userItemData =  viewModel.userLiveData


        viewModel.userLiveData.observe(this,{


        })

    }

}
