package com.phoenixredwolf.testtracker.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.phoenixredwolf.testtracker.data.model.CharacterResponse
import com.phoenixredwolf.testtracker.data.model.utility.NetworkResult
import com.phoenixredwolf.testtracker.data.repo.DataRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repo: DataRepository): ViewModel() {

    var characters = MutableStateFlow<NetworkResult<CharacterResponse>>(NetworkResult.Idle)
        private set

    init {
        getData()
    }

    fun getData() {
        viewModelScope.launch {
            repo.getData().collect { result ->
                characters.value = result
            }
        }
    }
}