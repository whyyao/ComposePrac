package com.example.composeprac.model

import com.fasterxml.jackson.annotation.JsonProperty

class CardCollection {
    @JsonProperty("cards")
    val cards: List<Card>? = null
}
