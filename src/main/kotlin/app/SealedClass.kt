package app

import oop.`object`.`class`.Minus
import oop.`object`.`class`.Modulo
import oop.`object`.`class`.Operation
import oop.`object`.`class`.Plus

fun operation(value: Int, value1: Int, operation: Operation): Int {
    return when (operation) {
        is Plus -> value + value1
        is Minus -> value - value1
        is Modulo -> value % value1
    }
}

fun main() {
    println(operation(10, 10, Plus()))
    println(operation(11, 10, Minus()))
    println(operation(30, 20, Modulo()))
}