package app

import oop.`object`.`class`.Product

fun main() {
    val product = Product("Indomie", 5_000, "Food")

    val product1 = product.copy(name = "Sarimi")

    println(product)
    println(product1)
}