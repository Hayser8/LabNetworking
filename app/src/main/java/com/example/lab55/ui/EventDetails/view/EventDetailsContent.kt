package com.example.lab55.ui.EventDetails.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.lab55.Event

@Composable
fun EventDetailsContent(navController: NavController, eventId: String, events: List<Event>) {

    val event = events.find { it.id == eventId }

    if (event != null) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            // Imagen
            Image(
                painter = painterResource(id = event.imageResourceId),
                contentDescription = "Event Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )

            // Titulo del evento
            Text(
                text = event.title,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(16.dp)
            )

            // Fecha y hora del evento
            Text(
                text = "Fecha y Hora: ${event.fechayhora}",
                fontSize = 16.sp,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 8.dp)
            )

            // Sobre el evento
            Text(
                text = "Sobre el Evento:",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp)
            )

            // Resumen del evento
            Text(
                text = event.description,
                fontSize = 16.sp,
                modifier = Modifier.padding(16.dp)
            )

            Spacer(modifier = Modifier.weight(1f))

            // Botones
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(onClick = { /* Acción cuando se presiona Favoritos */ }) {
                    Text(text = "Favoritos")
                }

                Button(onClick = { /* Acción cuando se presiona Comprar */ }) {
                    Text(text = "Comprar")
                }
            }
        }
    } else {
        Text(
            text = "Evento no encontrado",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )
    }
}