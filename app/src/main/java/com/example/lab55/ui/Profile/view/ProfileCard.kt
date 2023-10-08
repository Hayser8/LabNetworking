package com.example.lab55.ui.Profile.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class ProfileCardItem(
    val title: String,
    val imageResourceId: Int,
    val hasToggleButton: Boolean,
    var isChecked: Boolean
)

@Composable
fun ProfileCardItem(cardItem: ProfileCardItem) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = cardItem.imageResourceId),
                contentDescription = "Card Image",
                modifier = Modifier
                    .size(16.dp)
                    .clip(shape = RoundedCornerShape(4.dp))
            )
            Spacer(modifier = Modifier.width(15.dp))
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = cardItem.title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                )
                if (cardItem.hasToggleButton) {
                    Spacer(modifier = Modifier.height(8.dp))
                    ToggleButton(isChecked = cardItem.isChecked) { newCheckedState ->
                        cardItem.isChecked = newCheckedState
                    }
                }
            }
        }
    }
}

@Composable
fun ToggleButton(isChecked: Boolean, onToggle: (Boolean) -> Unit) {
    Switch(
        checked = isChecked,
        onCheckedChange = {
            onToggle(!isChecked)
        },
        modifier = Modifier
            .background(Color.LightGray, CircleShape)
            .padding(4.dp)
    )
}
