package com.vueltaf1nal.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vueltaf1nal.app.ui.theme.*
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

@Serializable
data class DriverResult(
    val pos: Int,
    val name: String,
    val team: String,
    val time: String
)

@Serializable
data class MaxSpeedData(
    val name: String,
    val topSpeed: Double,
    val speedLap: Int
)

sealed class Screen {
    object List : Screen()
    object TopSpeeds : Screen()
}

val client = HttpClient(OkHttp) {
    install(ContentNegotiation) {
        json(Json { ignoreUnknownKeys = true })
    }
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VueltaF1nalTheme {
                var currentScreen by remember { mutableStateOf<Screen>(Screen.List) }
                var results by remember { mutableStateOf<List<DriverResult>>(emptyList()) }
                var isLoading by remember { mutableStateOf(true) }
                var error by remember { mutableStateOf<String?>(null) }

                LaunchedEffect(Unit) {
                    try {
                        results = client.get("http://10.0.2.2:8080/api/results").body()
                        isLoading = false
                    } catch (e: Exception) {
                        error = "Error: No se pudo conectar con el motor."
                        isLoading = false
                    }
                }

                Surface(modifier = Modifier.fillMaxSize(), color = DeepNavy) {
                    if (isLoading) {
                        Box(contentAlignment = Alignment.Center) { CircularProgressIndicator(color = RacingRed) }
                    } else if (error != null) {
                        Box(contentAlignment = Alignment.Center) { Text(error!!, color = Color.White) }
                    } else {
                        when (currentScreen) {
                            is Screen.List -> ResultListScreen(
                                results = results,
                                onSeeTopSpeeds = { currentScreen = Screen.TopSpeeds }
                            )
                            is Screen.TopSpeeds -> TopSpeedsScreen(
                                onBack = { currentScreen = Screen.List }
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ResultListScreen(results: List<DriverResult>, onSeeTopSpeeds: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().background(DeepNavy).padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = Modifier.size(100.dp), contentAlignment = Alignment.Center) {
            Text("LOGO", color = RacingRed, fontWeight = FontWeight.Bold)
        }
        Text("GP BRASIL 2024", color = Color.White, fontSize = 18.sp, fontWeight = FontWeight.Bold)
        
        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = onSeeTopSpeeds,
            colors = ButtonDefaults.buttonColors(containerColor = RacingRed),
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text("VER TOP VELOCIDADES DEL GP", fontWeight = FontWeight.Bold)
        }

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            items(results) { driver ->
                ResultCard(driver)
            }
        }
    }
}

@Composable
fun ResultCard(driver: DriverResult) {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = BrightNavy),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
            Column(modifier = Modifier.weight(1f)) {
                Text("P${driver.pos} ${driver.name}", color = Color.White, fontWeight = FontWeight.Bold)
                Text(driver.team, color = AeroSilver, fontSize = 12.sp)
            }
            Text(text = driver.time, color = TelemetryGreen, fontSize = 12.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun TopSpeedsScreen(onBack: () -> Unit) {
    var topSpeeds by remember { mutableStateOf<List<MaxSpeedData>>(emptyList()) }
    var isLoading by remember { mutableStateOf(true) }

    LaunchedEffect(Unit) {
        try {
            topSpeeds = client.get("http://10.0.2.2:8080/api/max-speed").body()
            isLoading = false
        } catch (e: Exception) {
            isLoading = false
        }
    }

    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("TOP SPEEDS - BRASIL", color = RacingRed, fontSize = 24.sp, fontWeight = FontWeight.ExtraBold)
        
        Spacer(modifier = Modifier.height(24.dp))
        
        if (isLoading) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator(color = RacingRed)
            }
        } else {
            LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                items(topSpeeds) { data ->
                    SpeedCard(data)
                }
            }
        }

        Spacer(modifier = Modifier.weight(1f))

        TextButton(onClick = onBack) {
            Text("← VOLVER A RESULTADOS", color = AeroSilver, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun SpeedCard(data: MaxSpeedData) {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = BrightNavy),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(text = data.name.uppercase(), color = Color.White, fontWeight = FontWeight.Bold)
                Text(text = "VUELTA ${data.speedLap}", color = AeroSilver, fontSize = 10.sp)
            }
            Text(text = "${data.topSpeed} KM/H", color = TelemetryGreen, fontSize = 18.sp, fontWeight = FontWeight.Black)
        }
    }
}