package com.vueltaf1nal.app.data.mappers

import com.vueltaf1nal.app.data.dtos.DriverResultDto
import com.vueltaf1nal.app.data.remote.ResultsService
import com.vueltaf1nal.app.domain.models.DriverResult

class ResultsMapper(private val resultsService: ResultsService) {

    suspend fun getDriverResults(): List<DriverResult> {
        return resultsService.getResults().map { it.toDomain() }
    }
}

fun DriverResultDto.toDomain(): DriverResult =
        DriverResult(position = pos, name = name, team = team, time = time)
