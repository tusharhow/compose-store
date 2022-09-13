package com.example.mexstore.views.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun SearchRow() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        SearchBar()
        Spacer(modifier = Modifier.size(16.dp))
        Box(
            modifier = Modifier
                .height(50.dp)
                .width(55.dp)
                .shadow(1.dp, RoundedCornerShape(15.dp))
                .background(Black)
        )
        {
            IconButton(onClick = { }) {
                Image(
                    painter = painterResource(id = com.example.mexstore.R.drawable.setting),
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(color = Color.White),
                    modifier = Modifier
                        .size(20.dp)
                )
            }
        }
    }
}











