package com.core.network.datasource

import com.core.network.model.Performance

interface  PerformanceDataSource {
    suspend fun fetchPerformances(): List<Performance>
}