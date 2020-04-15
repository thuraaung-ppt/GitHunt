package com.thuraaung.githunt.repository.remote

import com.thuraaung.githunt.api.TrendingApiService
import com.thuraaung.githunt.model.ModelTrendingRepo
import retrofit2.Response


class RemoteDataSource(
    private val apiService: TrendingApiService
) {

    suspend fun getTrendingRepos() : Response<List<ModelTrendingRepo>> {
        return apiService.getTrendingRepos()
    }
}