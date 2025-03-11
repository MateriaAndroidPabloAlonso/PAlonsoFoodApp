package com.example.palonsofoodapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.palonsofoodapp.components.CategoryItem
import com.example.palonsofoodapp.components.Header
import com.example.palonsofoodapp.models.categoriesList
import com.example.palonsofoodapp.ui.theme.PAlonsoFoodAppTheme

@Composable
fun HomeScreen(innerPadding : PaddingValues) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(40.dp)
    ) {
        Header()
        Spacer(modifier = Modifier.height(16.dp))

        Text("Nuestras categorías", fontSize = 18.sp, fontWeight = FontWeight.Bold)
        LazyRow (
            modifier = Modifier.fillMaxWidth().padding(top = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(categoriesList) { category ->
                CategoryItem(category = category)
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Busca los mejores restaurantes", fontSize = 18.sp, fontWeight = FontWeight.Bold)
    }
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