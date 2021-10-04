package app

import oop.`object`.`class`.Calon
import oop.`object`.`class`.sayangAkoh
import oop.`object`.`class`.upperName

fun main() {
    val calon = Calon("Maya", 27)
    calon.sayangAkoh("Dani")

    // Nullable Extension Function
    val calon1: Calon? = Calon("Yulisma", 24)
    calon1.sayangAkoh("Dani")
    println(calon1?.upperName)

    val gandes = Calon("Gandes", 26)
    gandes.sayangAkoh("Dani")
    println(gandes.upperName)
}