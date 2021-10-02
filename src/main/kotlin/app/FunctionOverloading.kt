package app

import oop.`object`.`class`.Car

fun main() {
    val dani = Car()
    dani.brand = "Honda"
    dani.year = 2021

    dani.sayHello("Du")
    dani.sayHello("Joko", "Nu")
}