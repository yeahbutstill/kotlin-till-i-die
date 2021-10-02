package app

import oop.`object`.`class`.Car

fun main() {

    val dani = Car()
    dani.brand = "Nascar"
    dani.year = 2021

    dani.sayHello("Budi")
    dani.run()

    val cars = dani.getCars()
    println(cars)

}