package com.sbsj.practicecoding.activity



import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.sbsj.practicecoding.MyApplication
import com.sbsj.practicecoding.viewmodel.BaseViewModel

abstract class BaseActivity<B : ViewDataBinding, M : BaseViewModel> :AppCompatActivity(){


    lateinit var binding: B
    abstract val layoutId: Int
    abstract val viewModel : M

    val myApplication: MyApplication get() = application as MyApplication


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,layoutId)
        binding.lifecycleOwner= this
        viewModel.loadDatabase(myApplication.applicationContext)
        Log.e("",""+viewModel.userlist.toString())
    }


}