package main

import main.learning.domain.model.Coordinates
import main.learning.domain.model.Direction
import main.learning.RoverDriverImpl
import main.learning.RoverImpl

fun main(args: Array<String>) {

    val driver1 = RoverDriverImpl(RoverImpl(
        Coordinates(1, 2, 5, 5),
        Direction('N')
    ), "LMLMLMLMM")
    driver1.drive()

    val driver2 = RoverDriverImpl(RoverImpl(
        Coordinates(3, 3, 5, 5),
        Direction('E')
    ), "MMRMMRMRRM")
    driver2.drive()
}

