package com.example.list.screens.viewmodel

import com.example.list.screens.BaseViewModel
import com.example.list.screens.repository.MainRepository
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: MainRepository) :
    BaseViewModel() {
}