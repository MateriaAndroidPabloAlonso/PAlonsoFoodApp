package com.example.palonsofoodapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.palonsofoodapp.ui.theme.PAlonsoFoodAppTheme

@Composable
fun HomeScreen(innerPadding : PaddingValues) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {  }
}

@Preview (
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL
)

@Composable
fun HomeScreenPreview() {
    PAlonsoFoodAppTheme {
        HomeScreen(innerPadding = PaddingValues(20.dp))
    }
}