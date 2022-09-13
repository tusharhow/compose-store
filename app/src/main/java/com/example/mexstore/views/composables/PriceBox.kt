package com.example.mexstore.views.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mexstore.R

@Composable
fun PriceBox(){
    Box(modifier = Modifier
        .padding(start = 16.dp, end = 16.dp)
        .fillMaxWidth(0.8F)){
        Column {
            Text(
                text = "Price",
                textAlign = TextAlign.Start,
                fontSize = 16.sp,
                color = Color.White,
            )
            Text(
                text = "\$26,858",
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start,
                fontSize = 16.sp,
                color = Color.White,
            )
        }
        IconButton(onClick = { },
            Modifier
                .size(32.dp)
                .align(
                    Alignment.BottomEnd
                )) {
            Image(painterResource(id = R.drawable.heart), contentDescription = null, colorFilter = ColorFilter.tint(color = Color.White), modifier = Modifier.size(20.dp))

        }
    }
}