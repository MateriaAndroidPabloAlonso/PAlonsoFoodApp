package com.example.palonsofoodapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.palonsofoodapp.models.Restaurant
import com.example.palonsofoodapp.models.restaurantsList
import com.example.palonsofoodapp.ui.theme.PAlonsoFoodAppTheme

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun RestaurantItem(restaurant: Restaurant) {
    Column (horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(
            modifier = Modifier.background(Color.White, shape = CircleShape)
                .size(100.dp),
            contentAlignment = Alignment.Center
        ) {
            GlideImage(
                model = restaurant.image,
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )
        }
        Text(text = restaurant.name)
    }
}

@Preview
@Composable
fun RestaurantItemPreview() {
    PAlonsoFoodAppTheme {
        RestaurantItem(restaurant = restaurantsList[0])
    }
}