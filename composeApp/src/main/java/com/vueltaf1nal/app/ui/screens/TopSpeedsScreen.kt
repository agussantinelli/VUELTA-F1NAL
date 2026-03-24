package com.vueltaf1nal.app.ui.screens

import androidx.compose.foundation.Image
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
import com.vueltaf1nal.app.domain.models.MaxSpeed
import com.vueltaf1nal.app.ui.theme.*

@Composable
fun TopSpeedsScreen(
    topSpeeds: List<MaxSpeed>,
    isLoading: Boolean,
    onBack: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_oficial),
            contentDescription = "Vuelta F1nal Logo",
            modifier = Modifier.size(100.dp),
            contentScale = ContentScale.Fit
        )
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
fun SpeedCard(data: MaxSpeed) {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = BrightNavy),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(text = data.driverName.uppercase(), color = Color.White, fontWeight = FontWeight.Bold)
                Text(text = "VUELTA ${data.lap}", color = AeroSilver, fontSize = 10.sp)
            }
            Text(text = "${data.topSpeed} KM/H", color = TelemetryGreen, fontSize = 18.sp, fontWeight = FontWeight.Black)
        }
    }
}
