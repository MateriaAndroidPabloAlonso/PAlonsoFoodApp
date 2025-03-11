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
        image = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pngplay.com%2Fimage%2F196432&psig=AOvVaw0xJfKp7uvHRUmPYu8O-_v3&ust=1741751948113000&source=images&opi=89978449",
        rating = 4.5,
        price = 99.8
    ),
    Food(
        name = "Chicken Fries",
        image = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fburgerking.com.mt%2Fproducts%2Fchicken-fries-2%2F&psig=AOvVaw1YdSXMFvobwcjDrDTwGqCQ&ust=1741752051614000&source=images&cd=vfe&opi=89978449&ved=0CBUQjRxqFwoTCIjq7JWSgYwDFQAAAAAdAAAAABAE",
        rating = 4.3,
        price = 59.8
    ),
    Food(
        name = "Big Mac",
        image = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.mcdonalds.com%2Fus%2Fes-us%2Fproduct%2Fbig-mac.html&psig=AOvVaw3JtOl1Dlqp1i8Hn9GRQ8bW&ust=1741752099075000&source=images&opi=89978449",
        rating = 4.6,
        price = 79.8
    ),
    Food(
        name = "McFlurry",
        image = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.mcdonalds.com.mx%2Fmenu%2Fpostres&psig=AOvVaw2heE-L_6kl9jiJ-CmbrHPR&ust=1741752147129000&source=images&opi=89978449",
        rating = 4.7,
        price = 49.8
    ),
    Food(
        name = "Pizza",
        image = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.sams.com.mx%2Fip%2Fpizza-familiar-sam-s-cafe-pepperoni%2F000705138&psig=AOvVaw3l-rsAFglVbcMoXb303ZKL&ust=1741752195683000&source=images&opi=89978449",
        rating = 4.8,
        price = 89.9
    )
)