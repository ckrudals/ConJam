package com.km.concert.model

import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

@Root(name = "dbs", strict = false)
data class ConcertListResponse(
    @field:ElementList(name = "db", inline = true, required = false)
    var concerts: List<ConcertDto>? = null
)

@Root(name = "db", strict = false)
data class ConcertDto(
    @field:Element(name = "mt20id", required = false) var id: String = "",
    @field:Element(name = "prfnm", required = false) var name: String = "",
    @field:Element(name = "genrenm", required = false) var genre: String = "",
    @field:Element(name = "prfstate", required = false) var state: String = "",
    @field:Element(name = "prfpdfrom", required = false) var startDate: String = "",
    @field:Element(name = "prfpdto", required = false) var endDate: String = "",
    @field:Element(name = "poster", required = false) var posterUrl: String = "",
    @field:Element(name = "fcltynm", required = false) var facilityName: String = "",
    @field:Element(name = "openrun", required = false) var openRun: String = "",
    @field:Element(name = "area", required = false) var area: String = ""
)
