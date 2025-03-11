package com.example.palonsofoodapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.palonsofoodapp.models.Food
import com.example.palonsofoodapp.models.foodList
import com.example.palonsofoodapp.ui.theme.PAlonsoFoodAppTheme

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun FoodCard(food: Food) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ){
        Box(contentAlignment = Alignment.BottomEnd) {
            GlideImage(
                model = food.image,
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )

            Box (
                modifier = Modifier
                    .background(Color.Red, shape = RoundedCornerShape(8.dp))
                    .padding(horizontal = 8.dp, vertical = 4.dp)
            ) {
                Text(
                    text = "$${food.price}",
                    color = Color.White,
                    fontSize = 14.sp
                )
            }
        }
        Row (
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "★", color = Color.Green, fontSize = 16.sp)
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = "${food.rating}", fontSize = 14.sp)
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = food.name)
        }
    }
}

@Preview
@Composable
fun FoodCardPreview() {
    PAlonsoFoodAppTheme {
        FoodCard(food = foodList[0])
    }
}