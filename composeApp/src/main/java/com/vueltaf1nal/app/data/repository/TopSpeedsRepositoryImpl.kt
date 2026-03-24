package com.vueltaf1nal.app.data.repository

import com.vueltaf1nal.app.data.remote.TopSpeedsService
import com.vueltaf1nal.app.domain.models.MaxSpeed
import com.vueltaf1nal.app.domain.repository.TopSpeedsRepository

class TopSpeedsRepositoryImpl(
    private val topSpeedsService: TopSpeedsService
) : TopSpeedsRepository {

    override suspend fun getTopSpeeds(): List<MaxSpeed> {
        return topSpeedsService.getTopSpeeds().map { dto ->
            MaxSpeed(
                driverName = dto.name,
                topSpeed = dto.topSpeed,
                lap = dto.speedLap
            )
        }
    }
}
