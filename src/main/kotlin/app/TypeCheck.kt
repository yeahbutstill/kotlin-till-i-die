package app

import oop.`object`.`class`.Computer
import oop.`object`.`class`.Laptop

/**
 * Any bisa menerima parameter apapun itu
 */
fun printObject(any: Any) {
    println(any)
}

fun isObject(any: Any) {
    // melakukan pengecekan menggunakan is, secara auto tipe data yang kita check akan berubah menjadi tipe data yang kita check
    if (any is Laptop) {
        println("Laptop ${any.brand}")
    } else if (any is Computer) {
        println("Computer ${any.brand}")
    } else {
        println(any)
    }
}

fun isObjectWithWhen(any: Any) {
    // melakukan pengecekan menggunakan is, secara auto tipe data yang kita check akan berubah menjadi tipe data yang kita check
    when (any) {
        is Laptop -> {
            println("Laptop ${any.brand}")
        }
        is Computer -> {
            println("Computer ${any.brand}")
        }
        else -> {
            println(any)
        }
    }
}

fun safeNullCasts(any: Any) {
    val value: String? = any as? String
    println(value)
}

fun main() {
    printObject("Dani")
    printObject(1)
    printObject(Laptop("Acer"))
    printObject(Computer("IBM"))
    println()
    isObject("Maya")
    isObject(2)
    isObject(Laptop("Mac"))
    isObject(Computer("Apple"))
    println()
    isObjectWithWhen("Mom")
    isObjectWithWhen(3)
    isObjectWithWhen(Laptop("Mac"))
    isObjectWithWhen(Computer("Apple"))
    println()
    safeNullCasts("Dani") // Success
    safeNullCasts(1) // null karena tidak sama dengan tipenya

}