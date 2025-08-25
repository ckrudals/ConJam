package com.core.network.di

import com.core.network.datasource.PerformanceDataSource
import com.core.network.datasource.PerformanceDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    abstract fun providePerformanceDataSource(
        performanceDataSourceImpl: PerformanceDataSourceImpl
    ): PerformanceDataSource
}