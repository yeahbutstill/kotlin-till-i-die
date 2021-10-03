package app

import oop.`object`.`class`.Rectangel

fun main() {
    val rectangel = Rectangel()
    println("Corner ${rectangel.corner}")
    println("Parent Corner ${rectangel.parentCorner}")

    rectangel.printName()
}