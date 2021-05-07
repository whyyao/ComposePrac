package com.example.composeprac.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Card(
    @field:JsonProperty("name") var name: String? = null,
)