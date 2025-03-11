package com.example.palonsofoodapp.models

data class Food(
    val name: String,
    val image: String,
    val rating: Double,
    val price: Double
)

val foodList = listOf(
    Food(
        name = "Whooper",
        image = "https://www.pngplay.com/wp-content/uploads/9/Burger-King-PNG-Clipart-Background.png",
        rating = 4.5,
        price = 99.8
    ),
    Food(
        name = "Chicken Fries",
        image = "https://burgerking.com.mt/wp-content/uploads/2020/03/Chicken-fries-500-x-500.png",
        rating = 4.3,
        price = 59.8
    ),
    Food(
        name = "Big Mac",
        image = "https://s7d1.scene7.com/is/image/mcdonalds/DC_202302_0005-999_BigMac_1564x1564-1?wid=1000&hei=1000&dpr=off",
        rating = 4.6,
        price = 79.8
    ),
    Food(
        name = "McFlurry",
        image = "https://cache-mcd-middleware.mcdonaldscupones.com/media/image/product\$59b3c7f5-e5fc-446f-b012-caa25de3d4e1/200/200/original?country=mx",
        rating = 4.7,
        price = 49.8
    ),
    Food(
        name = "Pizza",
        image = "data:image/jpeg;base64,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",
        rating = 4.8,
        price = 89.9
    )
)