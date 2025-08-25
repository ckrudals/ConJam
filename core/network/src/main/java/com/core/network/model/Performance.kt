package com.core.network.model

data class Performance(
    val area: String,
    val endDate: String,
    val facilityName: String,
    val genre: String,
    val id: String,
    val openRun: String,
    val poster: String,
    val startDate: String,
    val state: String,
    val title: String
){
    fun toDomain() = com.core.model.Performance(
        area = area,
        endDate = endDate,
        facilityName = facilityName,
        genre = genre,
        id = id,
        openRun = openRun,
        poster = poster,
        startDate = startDate,
        state = state,
        title = title
    )
}