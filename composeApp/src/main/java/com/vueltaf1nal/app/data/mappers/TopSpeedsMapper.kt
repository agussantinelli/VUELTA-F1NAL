package com.vueltaf1nal.app.data.mappers

import com.vueltaf1nal.app.data.dtos.MaxSpeedDto
import com.vueltaf1nal.app.data.remote.TopSpeedsService
import com.vueltaf1nal.app.domain.models.MaxSpeed
import com.vueltaf1nal.app.data.repositories.TopSpeedsRepository

/**
 * Mapper for [MaxSpeed] data orchestration and transformation.
 * Follows the One Mapper Per Class rule.
 */
class TopSpeedsMapper(
    private val topSpeedsService: TopSpeedsService
) : TopSpeedsRepository {

    override suspend fun getTopSpeeds(): List<MaxSpeed> {
        return topSpeedsService.getTopSpeeds().map { it.toDomain() }
    }
}

/**
 * Extension function to convert [MaxSpeedDto] to [MaxSpeed].
 */
fun MaxSpeedDto.toDomain(): MaxSpeed = MaxSpeed(
    driverName = name,
    topSpeed = topSpeed,
    lap = speedLap
)
