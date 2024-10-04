package com.example.pokedexapp

import com.google.gson.annotations.SerializedName

class PokedexObject {
    @SerializedName("count") val count: Int,
    @SerializedName("results") val results: ArrayList<PokemonBase>
}