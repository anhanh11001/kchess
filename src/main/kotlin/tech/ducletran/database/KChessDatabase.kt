package tech.ducletran.database

import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction
import tech.ducletran.database.tables.GameTable
import tech.ducletran.database.tables.RoomTable
import tech.ducletran.database.tables.UserTable


class KChessDatabase {
    private companion object {
        const val DATABASE_URL = "jdbc:h2:mem:test"
        const val DATABASE_DRIVER = "org.h2.Driver"
        const val DATABASE_USERNAME = "root"
        const val DATABASE_PASSWORD = "password"
    }

    fun setupDatabase(): Database {
        val db = Database.connect(
            DATABASE_URL,
            driver = DATABASE_DRIVER,
            user = DATABASE_USERNAME,
            password = DATABASE_PASSWORD
        )

        performTransaction {
            SchemaUtils.create(GameTable, RoomTable, UserTable)
        }
        return db
    }

    fun <T> performTransaction(db: Database? = null, statement: Transaction.() -> T) {
        transaction {
            addLogger(StdOutSqlLogger)
            statement()
        }
    }
}

