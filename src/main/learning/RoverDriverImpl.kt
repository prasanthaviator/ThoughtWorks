package main.learning

import main.learning.domain.model.Instruction

class RoverDriverImpl(private val rover: Rover, private val movements: String) : RoverDriver {
    override fun drive() {
        for (movement in movements.toCharArray()) {
            when (movement) {
                Instruction.MOVE -> rover.move()
                else -> rover.turn(movement)
            }
        }
        rover.printCurrentCoordinatesAndDirection()
    }
}
