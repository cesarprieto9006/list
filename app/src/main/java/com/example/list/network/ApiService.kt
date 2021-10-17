package com.example.list.network

import com.example.list.screens.main.model.ResponseMeaning
import com.example.list.utils.SuperAppConstants
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET(SuperAppConstants.EP_ACROMINE)
    fun search(@Query("sf") word: String): Observable<ResponseMeaning>

}