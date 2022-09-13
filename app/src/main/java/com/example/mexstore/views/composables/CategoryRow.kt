package com.example.mexstore.views.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CategoryRow(){
    Spacer(modifier = Modifier.size(16.dp))
    val categories = listOf("Popular", "New Arrivals", "Sale")
    var isSelected = mutableSetOf(false)
    Row {
        categories.forEach { category ->
            CategoryItem(category = category, onClick = {
                isSelected = mutableSetOf(true)

            },
                Color =  if (isSelected.contains(true)) Color.Green else Color.White
            )


        }
    }

}

@Composable
fun CategoryItem(category: String,
                 Color: Color ,
                 onClick: () -> Unit = {

                 }
) {
    Text(
        text = category,

        textAlign = TextAlign.Center,
        fontSize = 13.sp,
        color = Color,
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp)
            .shadow(1.dp, RoundedCornerShape(8.dp))
            .background(Color(0xff162544))
            .clip(RoundedCornerShape(8.dp))
            .padding(15.dp)
            .clickable(onClick = onClick)
    )
}