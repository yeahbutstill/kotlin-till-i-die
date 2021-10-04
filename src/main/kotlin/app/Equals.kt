package app

import oop.`object`.`class`.Company

fun main() {

    val company1 = Company("Dani")
    val company2 = Company("Dani")

    println(company1 == company2)
    println(company1 == company1)
    println(company2 == company1)

}