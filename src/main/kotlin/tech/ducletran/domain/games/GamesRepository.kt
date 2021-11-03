package tech.ducletran.domain.games

class GamesRepository {

    fun findGamesFromUsers(userId: Long): List<Game> {
        return TODO()
    }

    fun findGamesById(gameId: Long): Game {
        return TODO()
    }

    fun createNewGame(playerOneId: Long, playerTwoId: Long) {

    }

    fun playerNextMove(gameId: Long, playerId: Long, move: String) {

    }

    fun undoLastMove(gameId: Long) {

    }

    fun updateGameSettings(gameId: Long, gameSettings: GameSettings) {

    }
}