package app

import oop.`object`.`class`.Car
import oop.`object`.`class`.Person

/**
 * Main
 * Constructor adalah function yang pertama kali dieksekusi ketika object itu
 * dibuat
 *
 */
fun main() {
    val dani = Person(
        "Dani",
        "Setiawan", "SKOM", 28
    ) // Parameter Constructor

    val pengenPunyaMobil = Car() // Tidak menggunakan Constructor
    pengenPunyaMobil.brand = "Nascar"
    pengenPunyaMobil.year

    println(dani.firstName)
    println(pengenPunyaMobil.brand + " " + pengenPunyaMobil.year)

    // Menggunakan Secondary Constructor
    val maya = Person("maya", "triyanti")
    maya.age = 27

    val elsa = Person("elsa")
    elsa.age = 25

    println(elsa.firstName)
    println(elsa.age)

    println(maya.firstName + " " + maya.middleName + " " + maya.age)

}