package com.example.palonsofoodapp.models

data class Restaurant(
    val name: String,
    val image: String
)

val restaurantsList = listOf(
    Restaurant(
        name = "Burger King",
        image = "https://logodownload.org/wp-content/uploads/2015/02/burger-king-logo-0.png"
    ),
    Restaurant(
        name = "McDonald's",
        image = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/McDonald%27s_logo.svg/450px-McDonald%27s_logo.svg.png"
    ),
    Restaurant(
        name = "KFC",
        image = "https://cdn.iconscout.com/icon/free/png-512/free-kfc-2-226243.png?f=webp&w=256"
    ),
    Restaurant(
        name = "Subway",
        image = "https://cdn.iconscout.com/icon/free/png-256/free-subway-logo-icon-download-in-svg-png-gif-file-formats--food-and-beverages-pack-logos-icons-226366.png"
    ),
    Restaurant(
        name = "Pizza Hut",
        image = "https://graffica.info/wp-content/uploads/2017/07/Pizza_Hut_Logo_3.png"
    )
)