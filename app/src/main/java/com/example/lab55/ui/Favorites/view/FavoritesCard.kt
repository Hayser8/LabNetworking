package com.example.lab55.ui.Favorites.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TarjetaEventoFavorito(evento: EventoFavorito, numero: Int) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(135.dp) // Altura fija para hacer las tarjetas rectangulares
            .padding(8.dp), // Añadir espacio interno
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        shape = RectangleShape // Hacer esquinas cuadradas
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = evento.idImagen),
                contentDescription = "Imagen del Evento",
                modifier = Modifier
                    .size(100.dp) // Tamaño de la imagen
                    .clip(shape = RectangleShape) // Hacer esquinas cuadradas con RectangleShape
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = "$numero. ${evento.titulo}",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = evento.ubicacion,
                    fontSize = 14.sp,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                )
            }
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}
