package com.worksmile.sideeffects.launched_effect.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LaunchedEffectViewModel @Inject constructor() : ViewModel() {

    private val _liveData = MutableLiveData<Int>()
    val liveData: LiveData<Int> = _liveData
}