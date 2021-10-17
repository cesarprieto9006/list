package com.example.list.screens.main.repository

import com.example.list.network.ApiService
import com.example.list.screens.main.model.ResponseMeaning
import io.reactivex.rxjava3.core.Observable
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val apiService: ApiService
) {
    fun search(word: String): Observable<ResponseMeaning> {
        return apiService.search(word)
    }
}