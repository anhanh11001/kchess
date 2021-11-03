package tech.ducletran.database.tables

import org.jetbrains.exposed.dao.id.LongIdTable

object UserTable : LongIdTable() {
    val name = varchar("name", length = 50)
    val profileUrl = text("profile_url")
}