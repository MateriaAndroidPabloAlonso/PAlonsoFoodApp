package com.example.palonsofoodapp.models

data class Restaurant(
    val name: String,
    val image: String
)

val restaurantsList = listOf(
    Restaurant(
        name = "Burger King",
        image = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fes.logodownload.org%2Fburger-king-logo%2F&psig=AOvVaw0cYHvViRprALNsDCUkxocP&ust=1741751414880000&source=images&cd=vfe&opi=89978449&ved=0CBUQjRxqFwoTCNDi6OOPgYwDFQAAAAAdAAAAABAI"
    ),
    Restaurant(
        name = "McDonald's",
        image = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fes.m.wikipedia.org%2Fwiki%2FArchivo%3AMcDonald%2527s_logo.svg&psig=AOvVaw2PnzWoDHpiIGPB28aYEDW_&ust=1741751452462000&source=images&cd=vfe&opi=89978449&ved=0CBUQjRxqFwoTCID9ofaPgYwDFQAAAAAdAAAAABAI"
    ),
    Restaurant(
        name = "KFC",
        image = "https://www.google.com/url?sa=i&url=https%3A%2F%2Ficonscout.com%2Fes%2Ficons%2Fkfc&psig=AOvVaw1SjoALZQm7Gs4SZKLit7u_&ust=1741751519603000&source=images&cd=vfe&opi=89978449&ved=0CBUQjRxqFwoTCIiy5JaQgYwDFQAAAAAdAAAAABAE"
    ),
    Restaurant(
        name = "Subway",
        image = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pngegg.com%2Fes%2Fpng-etnbs&psig=AOvVaw1czLdb3eVkbIvfvf_Y128l&ust=1741751552652000&source=images&cd=vfe&opi=89978449&ved=0CBUQjRxqFwoTCNjd_qaQgYwDFQAAAAAdAAAAABAE"
    ),
    Restaurant(
        name = "Pizza Hut",
        image = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fgraffica.info%2Fquien-diseno-el-logo-de-pizza-hut%2F&psig=AOvVaw0VEj-d0OAhMR70wDndFpv9&ust=1741751596610000&source=images&opi=89978449"
    )
)