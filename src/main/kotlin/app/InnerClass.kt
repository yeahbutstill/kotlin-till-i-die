package app

/**
 * Membuat Object dari Inner Class
 */
import oop.`object`.`class`.Boss

fun main() {
    val dani = Boss("Dani")
    val maya = dani.Employee("Maya")
    maya.hi()
    val gandes = dani.Employee("Gandes")
    gandes.hi()
}