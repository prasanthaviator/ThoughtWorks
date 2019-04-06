package main.learning.domain.model

class Coordinates(var x: Int, var y: Int, val boundaryX: Int, val boundaryY: Int) {

    fun moveEast() {
        val resultX = x + 1
        if (resultX <= boundaryX) {
            x = resultX
        }
    }

    fun moveWest() {
        val resultX = x - 1
        if (resultX >= 0) {
            x = resultX
        }
    }

    fun moveSouth() {
        val resultY = y - 1
        if (resultY >= 0) {
            y = resultY
        }
    }

    fun moveNorth() {
        val resultY = y + 1
        if (resultY <= boundaryY) {
            y = resultY
        }
    }
}