package com.km.concert.di

import com.km.concert.ConcertRepositoryImpl
import com.km.concert.api.ConcertRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jakarta.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
internal abstract class ConcertModule {

    @Binds
    @Singleton
    abstract fun provideConcertRepository(
        concertRepository: ConcertRepositoryImpl,
    ): ConcertRepository
}