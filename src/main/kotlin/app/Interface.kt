package app

import oop.`object`.`class`.Crush
import oop.`object`.`class`.Human

fun main() {
    val human = Human("Dani")
    human.supDude("Tria")

    // Concrete Function di interface
    val crush = Crush("Dani")
    crush.sayHello("Maya")
    crush.go()
    crush.move()
}