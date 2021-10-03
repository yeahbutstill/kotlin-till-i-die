package app

import oop.`object`.`class`.Computer
import oop.`object`.`class`.Laptop

fun main() {
    val laptop = Laptop("Apple")
    println(laptop.toString())

    val computer = Computer("Asus")
    println(computer.hashCode())
}