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
        image = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.freepik.es%2Ficono%2Fcomida-china_1400695&psig=AOvVaw22NWppp-5IjhV670TPXc8q&ust=1741750852967000&source=images&cd=vfe&opi=89978449&ved=0CBUQjRxqFwoTCIj479mNgYwDFQAAAAAdAAAAABAE"
    ),
    Category(
        name = "Comida italiana",
        image = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.flaticon.es%2Ficono-gratis%2Fcomida-italiana_5930229&psig=AOvVaw3UFUM6l24Bp7YzlkCqqLpc&ust=1741750898698000&source=images&cd=vfe&opi=89978449&ved=0CBUQjRxqFwoTCOiEhdmOgYwDFQAAAAAdAAAAABAE"
    ),
    Category(
        name = "Comida mexicana",
        image = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.freepik.es%2Fvector-premium%2Filustracion-icono-vector-comida-mexicana-taco-objeto-comida-concepto-diseno-icono-amante-comida_32904909.htm&psig=AOvVaw177VfY6TefOn0vlb6CKym-&ust=1741751162057000&source=images&cd=vfe&opi=89978449&ved=0CBUQjRxqFwoTCMi72euOgYwDFQAAAAAdAAAAABAI"
    ),
    Category(
        name = "Postres",
        image = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.flaticon.es%2Ficono-gratis%2Fpostres_7182828&psig=AOvVaw35GBCz50G03fcZVm7gt8SN&ust=1741751214543000&source=images&cd=vfe&opi=89978449&ved=0CBUQjRxqFwoTCNDwsIWPgYwDFQAAAAAdAAAAABAE"
    )
)