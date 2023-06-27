package com.example.compositiongameapp.domain.repository

import com.example.compositiongameapp.domain.entity.GameSettings
import com.example.compositiongameapp.domain.entity.Level
import com.example.compositiongameapp.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}