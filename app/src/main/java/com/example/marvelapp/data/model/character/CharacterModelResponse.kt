package com.example.marvelapp.data.model.character

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CharacterModelResponse(
    @SerializedName("data")
    val data: CharacterModelData
): Serializable
