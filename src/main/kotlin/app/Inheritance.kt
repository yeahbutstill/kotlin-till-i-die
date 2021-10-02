package app

import oop.`object`.`class`.Manager
import oop.`object`.`class`.VicePresident

fun main() {

    val manager = Manager("Dani")
    manager.sayHello("Budi")

    val vicePresident = VicePresident("Budi")
    vicePresident.sayHello("Dani")

}