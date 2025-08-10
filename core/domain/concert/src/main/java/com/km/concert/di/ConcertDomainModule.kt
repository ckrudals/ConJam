package com.km.concert.di

import com.km.concert.api.GetConcertListUseCase
import com.km.concert.usecase.GetConcertListUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
internal abstract class ConcertDomainModule {

    @Binds
    abstract fun bindGetConcertListUseCase(
        getConcertListUseCaseImpl: GetConcertListUseCaseImpl,
    ): GetConcertListUseCase
}