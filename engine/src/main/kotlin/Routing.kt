package com.vueltaf1nal

import com.vueltaf1nal.data.repositories.ResultsRepository
import com.vueltaf1nal.data.repositories.SpeedRepository
import com.vueltaf1nal.routes.resultsRoutes
import com.vueltaf1nal.routes.speedRoutes
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    // Repository instances (In a real app, these would be injected)
    val resultsRepository = ResultsRepository()
    val speedRepository = SpeedRepository()

    routing {
        get("/") {
            call.respondText("🏁 VUELTA F1NAL: Motor encendido y listo.")
        }

        // Modularized routes
        resultsRoutes(resultsRepository)
        speedRoutes(speedRepository)
    }
}