package com.markeisj21.mygamingcatalog.domain

import com.markeisj21.mygamingcatalog.domain.items.GameItem
import com.markeisj21.mygamingcatalog.domain.items.SpecificGameItem
import com.markeisj21.mygamingcatalog.repo.GameRepository
import javax.inject.Inject

class GetGameByIdUseCase @Inject constructor(private val gameRepository: GameRepository){
    suspend operator fun invoke(id:Int):SpecificGameItem {
        return gameRepository.getGameById(id)
    }
}