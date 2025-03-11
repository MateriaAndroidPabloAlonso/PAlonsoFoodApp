package com.example.palonsofoodapp.models

data class Category(
    val name: String,
    val image: String
)

val categoriesList = listOf(
    Category(
        name = "Comida rapida",
        image = "https://cdn-icons-png.flaticon.com/512/2921/2921822.png"
    ),
    Category(
        name = "Comida china",
        image = "https://cdn-icons-png.flaticon.com/512/1211/1211014.png"
    ),
    Category(
        name = "Comida italiana",
        image = "https://cdn-icons-png.flaticon.com/512/2994/2994669.png"
    ),
    Category(
        name = "Comida mexicana",
        image = "https://cdn-icons-png.flaticon.com/512/3032/3032598.png"
    ),
    Category(
        name = "Postres",
        image = "https://cdn-icons-png.flaticon.com/512/5347/5347946.png"
    )
)