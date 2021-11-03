package tech.ducletran.di

import org.koin.dsl.module
import tech.ducletran.chessbot.ChessEngine
import tech.ducletran.domain.games.GamesRepository
import tech.ducletran.domain.rooms.RoomsRepository
import tech.ducletran.domain.users.UsersRepository

object KoinModules {
    private val usersModule = module {
        single { UsersRepository() }
    }
    private val gamesModule = module {
        single { GamesRepository() }
        single { ChessEngine() }
    }
    private val roomsModule = module {
        single { RoomsRepository() }
    }

    val koinModules = listOf(usersModule, gamesModule, roomsModule)
}