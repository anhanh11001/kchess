package tech.ducletran

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import tech.ducletran.database.KChessDatabase
import tech.ducletran.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        val kChessDatabase = KChessDatabase()
        kChessDatabase.setupDatabase()

        configureDependencyInjection()
        configureRouting()
        configureSecurity()
        configureSerialization()
    }.start(wait = true)
}
