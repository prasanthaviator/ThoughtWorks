package main.learning


interface Rover {
    fun move()
    fun turn(rotateDirection: Char)
    fun printCurrentCoordinatesAndDirection()
}
