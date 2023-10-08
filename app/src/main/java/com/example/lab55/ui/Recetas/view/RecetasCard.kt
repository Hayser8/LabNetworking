package com.example.lab55.ui.Recetas.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun RecipeCard(
    itemId: String,
    itemName: String,
    navController: NavController
) {
    Card(
        shape = RectangleShape,  // Establece la forma de la Card a RectangleShape para esquinas cuadradas
        modifier = Modifier
            .width(180.dp)  // Ancho fijo
            .height(80.dp)  // Ajusta la altura para que el texto tenga suficiente espacio
            .padding(8.dp)
            .clickable {
                navController.navigate("itemDetailLookup/$itemId")
            }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray),
        ) {
            // Nombre del ítem
            Text(
                text = itemName,
                style = MaterialTheme.typography.bodySmall,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp),
                maxLines = 3,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}
