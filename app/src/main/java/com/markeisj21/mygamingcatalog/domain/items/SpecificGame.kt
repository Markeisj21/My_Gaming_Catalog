package com.markeisj21.mygamingcatalog.domain.items

import com.google.gson.annotations.SerializedName
import com.markeisj21.mygamingcatalog.data.models.SpecificGameModel

data class SpecificGameItem(
    val id: Int,
    val title: String,
    val thumbnail: String,
    val description: String
)

fun SpecificGameModel.toSpecificGameItem() = SpecificGameItem(id, title, thumbnail, description)