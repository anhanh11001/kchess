package tech.ducletran.domain.rooms

data class Room(
    val roomId: Long,
    val roomName: String,
    val playerOneId: Long?,
    val playerTwoId: Long?
)