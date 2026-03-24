package com.vueltaf1nal.data.mappers

import com.vueltaf1nal.data.dtos.DriverResultDto
import com.vueltaf1nal.data.dtos.MaxSpeedDto
import com.vueltaf1nal.domain.models.DriverResult
import com.vueltaf1nal.domain.models.MaxSpeed

/**
 * Mappers for DriverResult entity.
 */
fun DriverResult.toDto(): DriverResultDto = DriverResultDto(
    pos = position,
    name = driverName,
    team = teamName,
    time = gap
)

fun DriverResultDto.toDomain(): DriverResult = DriverResult(
    position = pos,
    driverName = name,
    teamName = team,
    gap = time
)

/**
 * Mappers for MaxSpeed entity.
 */
fun MaxSpeed.toDto(): MaxSpeedDto = MaxSpeedDto(
    name = driverName,
    topSpeed = topSpeed,
    speedLap = lap
)

fun MaxSpeedDto.toDomain(): MaxSpeed = MaxSpeed(
    driverName = name,
    topSpeed = topSpeed,
    lap = speedLap
)
