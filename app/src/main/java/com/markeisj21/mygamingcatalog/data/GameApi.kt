package com.markeisj21.mygamingcatalog.data


import com.markeisj21.mygamingcatalog.data.models.GameModel
import com.markeisj21.mygamingcatalog.data.models.SpecificGameModel
import com.markeisj21.mygamingcatalog.util.Constants.Companion.URL_ENDPOINT
import com.markeisj21.mygamingcatalog.util.Constants.Companion.URL_GAME_ENDPOINT_ID
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GameApi {
    @GET(URL_ENDPOINT)
    suspend fun getGames(): Response<List<GameModel>>

    @GET(URL_GAME_ENDPOINT_ID)
    suspend fun getGameById(@Query(value = "id") id: Int): Response<SpecificGameModel>

}