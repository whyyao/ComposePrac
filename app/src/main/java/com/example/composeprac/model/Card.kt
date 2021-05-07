package com.example.composeprac.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Card(
    @field:JsonProperty("imageUrl") var imageUrl: String? = null,
    @field:JsonProperty("imageUrlHiRes") var imageUrlHiRes: String? = null
)