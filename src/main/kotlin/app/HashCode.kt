package app

import oop.`object`.`class`.Company

/**
 * untuk membandingkan object menjadi angka untuk tidak ada duplicate
 * jika hashCode sama maka dianggap objectnya sama
 */

fun main() {
    val company1 = Company("Dani")
    val company2 = Company("Dani")

    println(company1.hashCode() == company2.hashCode())
    println(company1.hashCode() == company1.hashCode())
    println(company2.hashCode() == company2.hashCode())

    println(company1.hashCode())
    println(company2.hashCode())
    println(company1.toString())
    println(company2.toString())
}