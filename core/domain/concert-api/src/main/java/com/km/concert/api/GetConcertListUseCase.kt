package com.km.concert.api

import com.km.concert.Concert

interface GetConcertListUseCase {
    suspend operator fun invoke(
        serviceKey: String,
        startDate: String,
        endDate: String,
        currentPage: Int,
        rows: Int,
        genreCode: String? = null
    ): List<Concert>
}