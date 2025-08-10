package com.km.concert.api

import com.km.concert.model.ConcertListResponse
import retrofit2.http.GET
import retrofit2.http.Query

internal interface ConcertAPI {
    @GET("pblprfr")
    suspend fun getConcertList(
        @Query("service") serviceKey: String,
        @Query("stdate") startDate: String,
        @Query("eddate") endDate: String,
        @Query("cpage") currentPage: Int,
        @Query("rows") rows: Int,
        @Query("shcate") genreCode: String? = null
    ) : ConcertListResponse
}