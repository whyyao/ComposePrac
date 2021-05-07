package com.example.composeprac.model

import com.fasterxml.jackson.annotation.JsonProperty

data class CardCollection(
    @field:JsonProperty("data")
    val cards: List<Card>? = null
)