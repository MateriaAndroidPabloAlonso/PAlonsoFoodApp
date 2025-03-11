package com.example.palonsofoodapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.palonsofoodapp.models.Category
import com.example.palonsofoodapp.models.categoriesList
import com.example.palonsofoodapp.ui.theme.PAlonsoFoodAppTheme

@Composable
fun CategoryItem(category: Category) {
    Column {  }
}

@Preview
@Composable
fun CategoryItemPreview() {
    PAlonsoFoodAppTheme {
        CategoryItem(category = categoriesList[0])
    }
}