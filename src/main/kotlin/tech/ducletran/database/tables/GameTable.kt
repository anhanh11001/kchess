package tech.ducletran.database.tables

import org.jetbrains.exposed.dao.id.LongIdTable

object GameTable : LongIdTable() {
    val playerOneId = long("player_one_id")
    val playerTwoId = long("player_two_id")
    val winnerId = long("winner_id")
    val move_sequence = text("move_sequence")
}