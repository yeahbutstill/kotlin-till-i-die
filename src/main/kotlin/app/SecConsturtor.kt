package app

import oop.`object`.`class`.Address

fun main() {

    val address = Address("Jalan A", "Jakarta")
    val address1 = Address("Jalan A", "Jakarta", "Indonesia")

    println(address.street)
    println(address1.city)

}