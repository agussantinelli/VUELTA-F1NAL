package com.vueltaf1nal.app.data.repository

import com.vueltaf1nal.app.data.remote.ResultsService
import com.vueltaf1nal.app.domain.models.DriverResult
import com.vueltaf1nal.app.domain.repository.ResultsRepository

class ResultsRepositoryImpl(
    private val resultsService: ResultsService
) : ResultsRepository {

    override suspend fun getDriverResults(): List<DriverResult> {
        return resultsService.getResults().map { dto ->
            DriverResult(
                position = dto.pos,
                name = dto.name,
                team = dto.team,
                time = dto.time
            )
        }
    }
}
