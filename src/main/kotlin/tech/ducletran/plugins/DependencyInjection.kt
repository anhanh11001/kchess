package tech.ducletran.plugins

import io.ktor.application.*
import org.koin.ktor.ext.Koin
import org.koin.logger.slf4jLogger
import tech.ducletran.di.KoinModules.koinModules

fun Application.configureDependencyInjection() {
    install(Koin) {
        slf4jLogger()
        modules(koinModules)
    }
}