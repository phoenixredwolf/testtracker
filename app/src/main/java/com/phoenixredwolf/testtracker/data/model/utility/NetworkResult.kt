package com.phoenixredwolf.testtracker.data.model.utility

sealed class NetworkResult<out T> {
    object Idle: NetworkResult<Nothing>()
    data class Loading<T>(val isLoading: Boolean) : NetworkResult<T>()
    data class Success<T>(val data: T) : NetworkResult<T>()
    data class Error<T>(val msg: String) : NetworkResult<T>()
}