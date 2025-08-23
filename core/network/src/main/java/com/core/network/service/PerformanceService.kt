package com.core.network.service

import com.core.network.model.PerformanceResponse
import retrofit2.Response
import retrofit2.http.GET

interface PerformanceService {
    @GET("/api/performances")
    suspend fun getPerformances(): Response<PerformanceResponse>
}