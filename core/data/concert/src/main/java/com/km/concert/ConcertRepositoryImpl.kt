package com.km.concert

import com.km.concert.api.ConcertAPI
import com.km.concert.api.ConcertRepository

internal class ConcertRepositoryImpl(
    private val api: ConcertAPI
) : ConcertRepository {

    override suspend fun getConcertList(
        serviceKey: String,
        startDate: String,
        endDate: String,
        currentPage: Int,
        rows: Int,
        genreCode: String?
    ): List<Concert> {
        val response = api.getConcertList(serviceKey, startDate, endDate, currentPage, rows, genreCode)
        return response.concerts?.map {
            Concert(
                id = it.id,
                name = it.name,
                genre = it.genre,
                state = it.state,
                startDate = it.startDate,
                endDate = it.endDate,
                posterUrl = it.posterUrl,
                facilityName = it.facilityName,
                openRun = it.openRun.equals("Y", ignoreCase = true),
                area = it.area
            )
        } ?: emptyList()
    }
}
