package com.core.data.repository

import com.core.model.Performance

interface PerformanceRepository {
    suspend fun getPerformances() : List<Performance>
}