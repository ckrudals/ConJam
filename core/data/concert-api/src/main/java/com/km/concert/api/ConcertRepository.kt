package com.km.concert.api

import com.km.concert.Concert

interface ConcertRepository {
    suspend fun getConcertList(
        serviceKey: String,
        startDate: String,
        endDate: String,
        currentPage: Int,
        rows: Int,
        genreCode: String? = null
    ): List<Concert>
}
