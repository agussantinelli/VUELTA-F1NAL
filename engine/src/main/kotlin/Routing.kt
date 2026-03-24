package com.vueltaf1nal

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.Serializable

@Serializable
data class Telemetry(val driver: String, val speed: String, val lap: Int)

@Serializable
data class DriverResultDto(
    val pos: Int,
    val name: String,
    val team: String,
    val time: String,
    val topSpeed: Double,
    val speedLap: Int
)

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("🏁 VUELTA F1NAL: Motor encendido y listo.")
        }

        get("/api/results") {
            val results = listOf(
                DriverResultDto(1, "Max Verstappen", "Red Bull Racing", "1:23:45.678", 325.4, 44),
                DriverResultDto(2, "Lando Norris", "McLaren", "+2.456s", 328.1, 56),
                DriverResultDto(3, "Charles Leclerc", "Ferrari", "+5.123s", 322.9, 52),
                DriverResultDto(4, "Oscar Piastri", "McLaren", "+12.678s", 324.5, 48),
                DriverResultDto(5, "Lewis Hamilton", "Mercedes", "+15.901s", 321.2, 58)
            )
            call.respond(results)
        }
    }
}