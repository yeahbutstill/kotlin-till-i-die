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
    val dani = Person("Dani",
        "Setiawan","SKOM") // Parameter Constructor

    val pengenPunyaMobil = Car() // Tidak menggunakan Constructor
    pengenPunyaMobil.brand = "Nascar"
    pengenPunyaMobil.year

    println(dani.firstName)
    println(pengenPunyaMobil.brand + " " + pengenPunyaMobil.year)
}