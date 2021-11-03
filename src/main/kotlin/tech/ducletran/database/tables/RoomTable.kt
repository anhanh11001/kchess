package tech.ducletran.database.tables

import org.jetbrains.exposed.sql.Table

object RoomTable : Table() {
    val id = varchar("id", 10)
    val name = varchar("name", length = 50)
    val playerOneId = long("player_one_id")
    val playerTwoId = long("player_two_id")

    override val primaryKey = PrimaryKey(id)
}
