package com.phoenixredwolf.testtracker.data.remote

import com.phoenixredwolf.testtracker.BuildConfig
import com.phoenixredwolf.testtracker.data.model.CharacterResponse
import com.phoenixredwolf.testtracker.data.model.utility.NetworkResult
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface ApiService {
    @GET(BuildConfig.SEARCH_TERM)
    suspend fun getData(): Flow<NetworkResult<CharacterResponse>>
}