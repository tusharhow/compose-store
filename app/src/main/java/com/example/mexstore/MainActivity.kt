package com.example.mexstore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.unit.dp
import com.example.mexstore.ui.theme.MexStoreTheme
import com.example.mexstore.views.composables.SearchRow
import com.example.mexstore.views.composables.CategoryRow
import com.example.mexstore.views.composables.ProductBox
import com.example.mexstore.views.composables.TopBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MexStoreTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Scaffold(backgroundColor = White) {
                        Column {
                            TopBar()
                            SearchRow()
                            CategoryRow()
                            Spacer(modifier = Modifier.size(30.dp))//   CategoryRow()
                            LazyRow {
                                items(5) { index ->
                                    if (index == 0) {
                                        Spacer(modifier = Modifier.size(16.dp))
                                    }
                                    ProductBox()
                                }
                            }
                            Spacer(modifier = Modifier.size(16.dp))
                            LazyRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                                items(5) { index ->
                                    if (index == 0) {
                                        Spacer(modifier = Modifier.size(16.dp))
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }
    }
}