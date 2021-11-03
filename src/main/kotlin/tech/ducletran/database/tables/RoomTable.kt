package tech.ducletran.database.tables

import org.jetbrains.exposed.dao.id.LongIdTable

object RoomTable : LongIdTable() {
    val name = varchar("name", length = 50)
    val playerOneId = long("player_one_id")
    val playerTwoId = long("player_two_id")
    val roomCodeName = varchar("room_code_name", 20)
}
