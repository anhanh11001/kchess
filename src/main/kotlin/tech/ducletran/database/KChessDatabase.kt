package tech.ducletran.database

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction
import tech.ducletran.database.tables.GameTable
import tech.ducletran.database.tables.RoomTable
import tech.ducletran.database.tables.UserTable

class KChessDatabase {
    private companion object {
        const val DATABASE_URL = "jdbc:postgresql://localhost:5432/kchess"
        const val DATABASE_USERNAME = "postgres"
        const val DATABASE_PASSWORD = "letran11001"
    }

    fun setupDatabase(): Database {
        val config = HikariConfig().also { config ->
            config.jdbcUrl = DATABASE_URL
            config.username = DATABASE_USERNAME
            config.password = DATABASE_PASSWORD
        }
        val db = Database.connect(HikariDataSource(config))

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

