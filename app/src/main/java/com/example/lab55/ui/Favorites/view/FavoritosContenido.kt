package com.example.lab55.ui.Favorites.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab55.R
data class EventoFavorito(val titulo: String, val ubicacion: String, val idImagen: Int)
@Composable
fun ContenidoFavoritos() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp), // Reducir el espaciado
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Tus favoritos",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = "Estos son tus eventos favoritos",
            fontSize = 14.sp,
            color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f),
            modifier = Modifier.padding(bottom = 16.dp)
        )
        val eventosFavoritos = listOf(
            EventoFavorito("Concierto de Bad Bunny", "Cardales", R.drawable.event_image_1_background),
            EventoFavorito("Concierto de Humbe", "Cardales", R.drawable.event_image_2_background),
            EventoFavorito("Concierto de EDM", "Parque de la industria", R.drawable.event_image_3_background),
            EventoFavorito("Concierto de Wos", "Majadas", R.drawable.event_image_4_background)
        )

        eventosFavoritos.forEachIndexed { index, evento ->
            TarjetaEventoFavorito(evento, index + 1)
        }
    }
}