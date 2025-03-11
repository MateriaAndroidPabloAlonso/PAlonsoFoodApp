package com.example.palonsofoodapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.palonsofoodapp.ui.theme.PAlonsoFoodAppTheme
import com.example.palonsofoodapp.utils.CircleUser
import com.example.palonsofoodapp.utils.Logout

@Composable
fun Header() {
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(imageVector = CircleUser, contentDescription = null, modifier = Modifier.size(35.dp))
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Hola, Pablo", fontSize = 30.sp, fontWeight = FontWeight.Bold)
        }
        Image(imageVector = Logout, contentDescription = null, modifier = Modifier.size(35.dp))
    }
}

@Preview
@Composable
fun HeaderPreview() {
    PAlonsoFoodAppTheme {
        Header()
    }
}