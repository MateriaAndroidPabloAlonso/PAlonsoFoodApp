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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
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
import com.example.palonsofoodapp.components.FoodCard
import com.example.palonsofoodapp.components.Header
import com.example.palonsofoodapp.components.RestaurantItem
import com.example.palonsofoodapp.models.categoriesList
import com.example.palonsofoodapp.models.foodList
import com.example.palonsofoodapp.models.restaurantsList
import com.example.palonsofoodapp.ui.theme.PAlonsoFoodAppTheme

@Composable
fun HomeScreen(innerPadding : PaddingValues) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 20.dp, vertical = 40.dp)
    ) {
        Header()
        Spacer(modifier = Modifier.height(16.dp))

        Text("Nuestras categorías", fontSize = 25.sp, fontWeight = FontWeight.SemiBold)
        LazyRow (
            modifier = Modifier.fillMaxWidth().padding(top = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(categoriesList) { category ->
                CategoryItem(category = category)
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Busca los mejores restaurantes", fontSize = 25.sp, fontWeight = FontWeight.SemiBold)
        LazyRow (
            modifier = Modifier.fillMaxWidth().padding(top = 20.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ){
            items(restaurantsList) { restaurant ->
                RestaurantItem(restaurant = restaurant)
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Nuestras mejores comidas", fontSize = 25.sp, fontWeight = FontWeight.SemiBold)
        LazyVerticalGrid(
            columns = GridCells.Fixed(count = 2)
        ) {
            items(foodList) { food ->
                FoodCard(food = food)
            }
        }
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