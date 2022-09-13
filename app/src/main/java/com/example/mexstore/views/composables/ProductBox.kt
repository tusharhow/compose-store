package com.example.mexstore.views.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mexstore.R

@Composable
fun ProductBox(modifier: Modifier = Modifier) {
    Box(
        modifier
            .width(243.dp)
            .heightIn(min = 150.dp)
    ) {
        Card(elevation = 4.dp, shape = RoundedCornerShape(8.dp)) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color(0xFF0C1B3A))
                    .heightIn(min = 378.dp)
                    .fillMaxWidth(0.8F)
            ) {
                Box(
                    Modifier
                        .size(140.dp)
                        .clip(RoundedCornerShape(100.dp))
                        .shadow(30.dp, shape = RoundedCornerShape(100.dp))
                        .background(Color(0xff162544))
                        .align(Alignment.Center)
                )
            }
        }
        Column {
            Text(
                text = "Mex\nJamming",
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start,
                fontSize = 22.sp,
                color = Color.White,
                modifier = Modifier.padding(paddingValues = PaddingValues(16.dp, 16.dp, 0.dp, 0.dp))
            )
            Image(
                painter = painterResource(id = R.drawable.shoe),
                contentDescription = null,
                modifier = Modifier
                    .width(243.dp)
                    .heightIn(100.dp)
            )
            Spacer(modifier = Modifier.size(16.dp))
            PriceBox()
        }
    }
}