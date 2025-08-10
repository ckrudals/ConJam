package com.km.concert

data class Concert(
    val id: String,
    val name: String,
    val genre: String,
    val state: String,
    val startDate: String,
    val endDate: String,
    val posterUrl: String,
    val facilityName: String,
    val openRun: Boolean,
    val area: String
)
