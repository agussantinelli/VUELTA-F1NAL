package com.vueltaf1nal.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            F1TelemetryTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF0B0B0B) // Negro asfalto
                ) {
                    TelemetryScreen()
                }
            }
        }
    }
}

@Composable
fun TelemetryScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "VUELTA F1NAL",
            color = Color.Red,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 2.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Tarjeta de Verstappen
        DriverCard(name = "MAX VERSTAPPEN", team = "Red Bull Racing", speed = "325", lap = "44")
    }
}

@Composable
fun DriverCard(name: String, team: String, speed: String, lap: String) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF1A1A1A)),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(20.dp)) {
            Text(text = team, color = Color.Gray, fontSize = 10.sp)
            Text(text = name, color = Color.White, fontSize = 24.sp, fontWeight = FontWeight.ExtraBold)

            Divider(modifier = Modifier.padding(vertical = 12.dp), color = Color(0xFF333333))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                TelemetryItem("SPEED", "$speed KM/H", Color(0xFF00FF00))
                TelemetryItem("LAP", lap, Color.White)
            }
        }
    }
}

@Composable
fun TelemetryItem(label: String, value: String, valueColor: Color) {
    Column {
        Text(text = label, color = Color.Gray, fontSize = 10.sp)
        Text(text = value, color = valueColor, fontSize = 18.sp, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun F1TelemetryTheme(content: @Composable () -> Unit) {
    MaterialTheme(content = content)
}