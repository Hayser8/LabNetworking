package com.example.lab55.ui.EventList.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.lab55.R
data class Event(val title: String, val location: String, val imageResourceId: Int)
@Composable
fun EventListContent() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val events = listOf(
            Event("Concierto de Bad Bunny", "Cardales", R.drawable.event_image_1_background),
            Event("Concierto de Humbe", "Cardales", R.drawable.event_image_2_background),
            Event("Concierto de EDM", "Parque de la industria", R.drawable.event_image_3_background),
            Event("Concierto de Wos", "Majadas", R.drawable.event_image_4_background)
        )

        events.forEach { event ->
            EventCard(event = event)
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}
