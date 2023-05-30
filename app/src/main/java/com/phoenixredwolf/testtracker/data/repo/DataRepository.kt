package com.phoenixredwolf.testtracker.data.repo

import com.phoenixredwolf.testtracker.data.model.CharacterResponse
import com.phoenixredwolf.testtracker.data.model.utility.NetworkResult
import com.phoenixredwolf.testtracker.data.remote.ApiService
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DataRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun getData(): Flow<NetworkResult<CharacterResponse>> = apiService.getData()

//    suspend fun getData() = flow {
//        emit(NetworkResult.Loading(true))
//        val response = apiService.getData()
//        emit(NetworkResult.Success(response))
//    }.catch { e ->
//        emit(NetworkResult.Error(e.message ?: "Unknown Error" ))
//    }
}