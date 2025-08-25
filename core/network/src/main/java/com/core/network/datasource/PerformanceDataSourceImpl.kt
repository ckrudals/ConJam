package com.core.network.datasource

import android.util.Log
import com.core.network.model.Performance
import com.core.network.service.PerformanceService
import javax.inject.Inject

class PerformanceDataSourceImpl @Inject constructor(
    private val performanceService: PerformanceService
) : PerformanceDataSource {

    override suspend fun fetchPerformances(): List<Performance> {
        return runCatching {
            performanceService.getPerformances().body()?.performances!!
        }.onFailure {
            Log.d("Error", "fetchPerformances: ${it.message}")
        }.getOrDefault(emptyList())
    }
}