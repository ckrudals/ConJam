package com.core.data.di

import com.core.data.repository.PerformanceRepository
import com.core.data.repository.PerformanceRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    abstract fun bindPerformanceRepository(
        concertRepositoryImpl: PerformanceRepositoryImpl
    ): PerformanceRepository
}