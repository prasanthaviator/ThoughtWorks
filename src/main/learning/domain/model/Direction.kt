package main.learning.domain.model

class Direction(var value: Char) {

    fun turnRight() {
        value = turnRight(value)
    }

    fun turnLeft() {
        value = turnLeft(value)
    }

    private fun turnRight(direction: Char): Char {
        return when (direction) {
            NORTH -> EAST
            SOUTH -> WEST
            EAST -> SOUTH
            WEST -> NORTH
            else -> direction
        }
    }

    private fun turnLeft(direction: Char): Char {
        return when (direction) {
            NORTH -> WEST
            SOUTH -> EAST
            EAST -> NORTH
            WEST -> SOUTH
            else -> direction
        }
    }

    companion object {
        const val NORTH = 'N'
        const val SOUTH = 'S'
        const val EAST = 'E'
        const val WEST = 'W'
    }
}