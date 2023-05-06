package com.markeisj21.mygamingcatalog.data.remote

import com.markeisj21.mygamingcatalog.data.GameApi
import com.markeisj21.mygamingcatalog.data.models.GameModel
import com.markeisj21.mygamingcatalog.data.models.SpecificGameModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GameService @Inject constructor(private val gameApi: GameApi) {

    suspend fun getGames(): List<GameModel> {
        return withContext(Dispatchers.IO) {
            val games = gameApi.getGames()
            games.body() ?: emptyList()
        }
    }

    suspend fun getGameById(id: Int): SpecificGameModel {

        return withContext(Dispatchers.IO) {
            val game = gameApi.getGameById(id)
            game.body()!!
        }
    }
}