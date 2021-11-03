package tech.ducletran.plugins

import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

private const val VERSION = 1

fun Application.configureRouting() {
    routeAuthentication()
    routeUsers()
    routeGames()
    routeRooms()
}

fun Application.routeAuthentication() {
    routing {
        post("/v$VERSION/auth/login") {

        }
        post("/v$VERSION/auth/logout") {

        }
        post("/v$VERSION/auth/blacklist") { }
    }
}

fun Application.routeUsers() {
    routing {
        // Create a new user login
        post("/v$VERSION/users") {

        }
        // Win-loss history
        get("/v$VERSION/users/{user_id}/history") {

        }
        get("/v$VERSION/users/{user_id}/profile") {

        }
    }
}

fun Application.routeRooms() {
    routing {
        // Get all rooms (public/private)
        get("/rooms") {

        }

        // Create a new room
        post("/v$VERSION/rooms") {

        }

        // Enter a room
        post("/v$VERSION/rooms/{room-id}/enter") {

        }
    }
}

fun Application.routeGames() {
    routing {
        // Play the next move
        post("/v$VERSION/games/move") {

        }
        // Undo
        post("/v$VERSION/games/undo") {

        }
        // Game settings
        post("/v$VERSION/games/settings") {

        }
    }
}
