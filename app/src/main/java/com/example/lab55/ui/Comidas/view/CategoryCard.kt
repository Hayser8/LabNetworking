package com.example.lab55.ui.Comidas.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import android.net.Uri

@Composable
fun CategoryCard(
    itemId: String,
    itemName: String,
    itemDescription: String,
    navController: NavController
) {
    Card(
        modifier = Modifier
            .width(180.dp)
            .height(80.dp)
            .padding(8.dp)
            .background(color = Color.LightGray)
            .clickable {
                val encodedItemName = Uri.encode(itemName)
                navController.navigate("recipesByCategory/$encodedItemName")
            }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = itemName,
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray
            )
        }
    }
}