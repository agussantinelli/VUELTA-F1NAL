package com.vueltaf1nal.routes

import com.vueltaf1nal.data.mappers.toDto
import com.vueltaf1nal.data.repositories.SpeedRepository
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.speedRoutes(repository: SpeedRepository) {
    get("/api/max-speed") {
        val speeds = repository.getAllTopSpeeds().map { it.toDto() }
        call.respond(speeds)
    }
}
