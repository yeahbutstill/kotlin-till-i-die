package app

import oop.`object`.`class`.Television

/**
 * Main
 *
 * Late initialized itu kaya sebat dulu baru jalan
 * properties yang engga mau disi diawal
 */
fun main() {
    val tv = Television()
    tv.initTelevision("Samsung")
    println(tv.brand)
}