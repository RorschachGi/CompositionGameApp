package com.example.compositiongameapp.domain.usecases

import com.example.compositiongameapp.domain.entity.GameSettings
import com.example.compositiongameapp.domain.entity.Level
import com.example.compositiongameapp.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {

    operator fun invoke(level: Level): GameSettings{
        return repository.getGameSettings(level)
    }

}