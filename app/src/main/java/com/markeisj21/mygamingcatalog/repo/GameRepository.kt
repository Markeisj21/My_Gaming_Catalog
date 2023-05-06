package com.markeisj21.mygamingcatalog.repo

import com.markeisj21.mygamingcatalog.data.remote.GameService
import com.markeisj21.mygamingcatalog.domain.items.GameItem
import com.markeisj21.mygamingcatalog.domain.items.SpecificGameItem
import com.markeisj21.mygamingcatalog.domain.items.toGameItem
import com.markeisj21.mygamingcatalog.domain.items.toSpecificGameItem
import javax.inject.Inject

class GameRepository @Inject constructor(private val gameService: GameService) {
 suspend fun   getGames() : List<GameItem>{
     return gameService.getGames().map { it.toGameItem() }
 }
    suspend fun getGameById( id:Int):SpecificGameItem{
        return gameService.getGameById(id).toSpecificGameItem()
    }
}