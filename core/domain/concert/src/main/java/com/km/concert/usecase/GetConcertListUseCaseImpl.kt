package com.km.concert.usecase

import com.km.concert.Concert
import com.km.concert.api.ConcertRepository
import com.km.concert.api.GetConcertListUseCase

class GetConcertListUseCaseImpl(
    private val repository: ConcertRepository
) : GetConcertListUseCase {

    override suspend operator fun invoke(
        serviceKey: String,
        startDate: String,
        endDate: String,
        currentPage: Int,
        rows: Int,
        genreCode: String?
    ): List<Concert> {
        return repository.getConcertList(
            serviceKey, startDate, endDate, currentPage, rows, genreCode
        )
    }
}
