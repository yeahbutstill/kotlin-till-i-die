package app

import oop.`object`.`class`.Application

typealias App = Application
typealias Data = data.Application
typealias StringSupplier = () -> String

fun sayHello(supplier: StringSupplier) {
    println("Hello ${supplier()}")
}

fun main() {
    val app = App("Kotlin App")
    val data = Data("Test Data")
    sayHello { "Dani" }
    println("${app.name} ${data.name}")
}