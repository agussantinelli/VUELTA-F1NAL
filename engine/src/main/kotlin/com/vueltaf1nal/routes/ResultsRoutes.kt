package com.vueltaf1nal.routes

import com.vueltaf1nal.data.mappers.toDto
import com.vueltaf1nal.data.repositories.ResultsRepository
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.resultsRoutes(repository: ResultsRepository) {
    get("/api/results") {
        val results = repository.getAllResults().map { it.toDto() }
        call.respond(results)
    }
}
