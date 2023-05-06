package com.markeisj21.mygamingcatalog.domain.items

import com.google.gson.annotations.SerializedName
import com.markeisj21.mygamingcatalog.data.models.GameModel

data class GameItem(
    val id: Int,
    val title: String,
    val thumbnail: String,
    val short_description: String
)

fun GameModel.toGameItem()= GameItem(id,title,thumbnail,short_description)