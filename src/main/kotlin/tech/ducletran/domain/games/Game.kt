package tech.ducletran.domain.games

import java.util.*

data class Game(
    val id: Long,
    val playerOneIdd: Long,
    val playerTwoId: Long,
    val winnerId: Long,
    val moveSequence: List<String>
)

data class GameSettings(
    val playerLength: Long
)