package com.example.list.screens.main.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.list.screens.BaseViewModel
import com.example.list.screens.main.model.ResponseMeaning
import com.example.list.screens.main.repository.MainRepository
import com.example.list.utils.SuperAppConstants
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import timber.log.Timber
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: MainRepository) :
    BaseViewModel() {

    private val _arrayMeaningResponse: MutableLiveData<ResponseMeaning> = MutableLiveData()
    val arrayMeaningResponse: LiveData<ResponseMeaning> get() = _arrayMeaningResponse

    var stateError = MutableLiveData(true)

    fun search(word: String) {
        repository.search(word)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ result ->
                _arrayMeaningResponse.value=result
            }
            ) { error ->
                Timber.tag(SuperAppConstants.TAG_ERROR).e(error)
            }
    }
}