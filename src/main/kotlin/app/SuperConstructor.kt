package app

import oop.`object`.`class`.ExecutiveCustomer
import oop.`object`.`class`.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Dani")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Dani", 70_000_000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}