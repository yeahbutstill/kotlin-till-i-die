package app

import oop.`object`.`class`.Delegate
import oop.`object`.`class`.DelegateAuto
import oop.`object`.`class`.MyBase

fun main() {
    // Manual
    val base = MyBase()
    base.sayHello("Dani")
    base.sayGoodBye("Maya")

    // Manual
    val baseDelegate = Delegate(base)
    baseDelegate.sayHello("Maya")
    baseDelegate.sayGoodBye("Dani")

    // Delegate Auto
    val myBase = MyBase()
    val delegate = DelegateAuto(myBase)
    delegate.sayHello("Dani")
}