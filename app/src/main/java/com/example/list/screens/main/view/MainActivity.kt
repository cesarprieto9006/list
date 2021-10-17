package com.example.list.screens.main.view

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.list.R
import com.example.list.databinding.ActivityMainBinding
import com.example.list.screens.BaseActivity
import com.example.list.screens.main.viewmodel.MainViewModel

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        val viewModel: MainViewModel =
            ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)
        setBaseViewModel(viewModel)

    }
}