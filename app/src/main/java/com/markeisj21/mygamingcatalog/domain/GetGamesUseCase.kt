package com.markeisj21.mygamingcatalog.domain

import com.markeisj21.mygamingcatalog.domain.items.GameItem
import com.markeisj21.mygamingcatalog.repo.GameRepository
import javax.inject.Inject

class GetGamesUseCase @Inject constructor(private val gameRepository: GameRepository) {
    suspend operator fun invoke(): List<GameItem>{
        return gameRepository.getGames()
    }
}