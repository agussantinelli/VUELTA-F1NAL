package com.vueltaf1nal.app.data.mappers

import com.vueltaf1nal.app.data.dtos.DriverResultDto
import com.vueltaf1nal.app.data.remote.ResultsService
import com.vueltaf1nal.app.domain.models.DriverResult
import com.vueltaf1nal.app.data.repositories.ResultsRepository

/**
 * Mapper for [DriverResult] data orchestration and transformation.
 * Follows the One Mapper Per Class rule.
 */
class ResultsMapper(
    private val resultsService: ResultsService
) : ResultsRepository {

    override suspend fun getDriverResults(): List<DriverResult> {
        return resultsService.getResults().map { it.toDomain() }
    }
}

/**
 * Extension function to convert [DriverResultDto] to [DriverResult].
 */
fun DriverResultDto.toDomain(): DriverResult = DriverResult(
    position = pos,
    name = name,
    team = team,
    time = time
)
