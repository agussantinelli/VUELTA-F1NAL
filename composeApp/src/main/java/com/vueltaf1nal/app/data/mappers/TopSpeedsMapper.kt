package com.vueltaf1nal.app.data.mappers

import com.vueltaf1nal.app.data.dtos.MaxSpeedDto
import com.vueltaf1nal.app.data.remote.TopSpeedsService
import com.vueltaf1nal.app.domain.models.MaxSpeed

class TopSpeedsMapper(private val topSpeedsService: TopSpeedsService) {

    suspend fun getTopSpeeds(): List<MaxSpeed> {
        return topSpeedsService.getTopSpeeds().map { it.toDomain() }
    }
}

fun MaxSpeedDto.toDomain(): MaxSpeed =
        MaxSpeed(driverName = name, topSpeed = topSpeed, lap = speedLap)
