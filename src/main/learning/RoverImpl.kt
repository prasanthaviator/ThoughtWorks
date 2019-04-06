package main.learning

import main.learning.domain.model.Coordinates
import main.learning.domain.model.Direction
import main.learning.domain.model.Instruction

class RoverImpl(var coordinates: Coordinates, var direction: Direction) : Rover {

    override fun move() {
        when (direction.value) {
            Direction.EAST -> coordinates.moveEast()
            Direction.WEST -> coordinates.moveWest()
            Direction.NORTH -> coordinates.moveNorth()
            Direction.SOUTH -> coordinates.moveSouth()
        }
    }

    override fun turn(turnDirection: Char) {
        if (turnDirection == Instruction.RIGHT) direction.turnRight() else direction.turnLeft()
    }

    override fun printCurrentCoordinatesAndDirection() {
        println("x = ${coordinates.x} y=  ${coordinates.y} direction = ${direction.value}")
    }
}