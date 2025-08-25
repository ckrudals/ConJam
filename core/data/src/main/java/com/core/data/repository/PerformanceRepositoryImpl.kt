package com.core.data.repository

import com.core.model.Performance
import com.core.network.datasource.PerformanceDataSource
import javax.inject.Inject

class PerformanceRepositoryImpl @Inject constructor(
    private val dataSource: PerformanceDataSource
) : PerformanceRepository {

    override suspend fun getPerformances(): List<Performance> {
        return dataSource.fetchPerformances().map { it.toDomain() }
    }
}