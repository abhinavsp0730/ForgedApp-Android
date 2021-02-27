package com.example.forgedapp

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
// todo Create viewmodel
class MainActivityViewModel(application: Application) : AndroidViewModel(application) {
    private val _loading = MutableLiveData<Boolean>()
    val loading: LiveData<Boolean>
        get() = _loading

    init {

    }

    fun finishLoadingWebView() {
        _loading.value = false
    }
}