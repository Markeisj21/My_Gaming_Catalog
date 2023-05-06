package com.markeisj21.mygamingcatalog.data.models


import com.google.gson.annotations.SerializedName

data class GameModel(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("thumbnail")
    val thumbnail: String,
    @SerializedName("short_description")
    val short_description: String

    )