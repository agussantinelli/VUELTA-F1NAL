package com.vueltaf1nal.app.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vueltaf1nal.app.R
import com.vueltaf1nal.app.domain.models.DriverResult
import com.vueltaf1nal.app.ui.theme.*

@Composable
fun ResultListScreen(
    results: List<DriverResult>, 
    onSeeTopSpeeds: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize().background(DeepNavy).padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_minimalista),
            contentDescription = "Vuelta F1nal Logo",
            modifier = Modifier.fillMaxWidth().height(80.dp).padding(horizontal = 32.dp),
            contentScale = ContentScale.Fit
        )
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
                Text("P${driver.position} ${driver.name}", color = Color.White, fontWeight = FontWeight.Bold)
                Text(driver.team, color = AeroSilver, fontSize = 12.sp)
            }
            Text(text = driver.time, color = TelemetryGreen, fontSize = 12.sp, fontWeight = FontWeight.Bold)
        }
    }
}
