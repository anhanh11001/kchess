package tech.ducletran.database.tables

import org.jetbrains.exposed.sql.Table

object UserTable : Table() {
    val userId = long("user_id")
    val name = long("name")
    val profileUrl = long("profile_url")

    override val primaryKey = PrimaryKey(userId)
}