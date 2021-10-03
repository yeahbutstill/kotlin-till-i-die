package app

import oop.`object`.`class`.Rectangel
import oop.`object`.`class`.Shape
import oop.`object`.`class`.Triangle

fun main() {
    val shape = Shape()
    println(shape.corner)

    val shape1 = Rectangel()
    println(shape1.corner)

    val shape2 = Triangle()
    println(shape2.corner)
}