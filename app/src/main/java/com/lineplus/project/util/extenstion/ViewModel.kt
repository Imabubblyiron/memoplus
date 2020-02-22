package com.lineplus.project.util.extenstion

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

inline fun <reified T> ViewModel.createMutableLiveData(defaultValue: T? = null): Lazy<MutableLiveData<T>> = lazy{
    MutableLiveData<T>(defaultValue)
}