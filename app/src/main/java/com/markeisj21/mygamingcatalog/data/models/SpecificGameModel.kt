package com.markeisj21.mygamingcatalog.data.models


import com.google.gson.annotations.SerializedName

data class SpecificGameModel(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("thumbnail")
    val thumbnail: String,
    @SerializedName("description")
    val description: String
)