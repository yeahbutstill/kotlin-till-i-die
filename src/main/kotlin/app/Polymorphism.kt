package app

import oop.`object`.`class`.Employee
import oop.`object`.`class`.Manager
import oop.`object`.`class`.VicePresident

/**
 * Main
 *
 * Polymorphism adalah kemampuan berubah bentuk dari 1 bentuk ke bentuk yang lain
 */
fun main() {
    var employee = Employee("Dani")
    employee.sayHello("Gandes")

    employee = Manager("Dani")
    employee.sayHello("Tria")

    employee = VicePresident("Dani")
    employee.sayHello("Yulisma")
}