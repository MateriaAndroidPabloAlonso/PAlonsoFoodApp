package com.example.palonsofoodapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.palonsofoodapp.models.Category
import com.example.palonsofoodapp.models.categoriesList
import com.example.palonsofoodapp.ui.theme.PAlonsoFoodAppTheme

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun CategoryItem(categories: Category) {
    Column (horizontalAlignment = Alignment.CenterHorizontally
    ){
        GlideImage(
            model = categories.image,
            contentDescription = null,
            modifier = Modifier.fillMaxSize().clip(RoundedCornerShape(24.dp)),
            contentScale = ContentScale.Crop
        )
        Text(text = categories.name, fontSize = 14.sp)
    }
}

@Preview
@Composable
fun CategoryItemPreview() {
    PAlonsoFoodAppTheme {
        CategoryItem(categories = categoriesList[0])
    }
}