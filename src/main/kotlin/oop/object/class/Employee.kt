package oop.`object`.`class`


/**
 * Employee
 *
 * @property name
 * @constructor Create empty Employee
 *
 * Overloading itu membuat function dengan nama yang sama disatu class
 * Overriding itu erat dengan inheritance kemampuan membuat ulang functio yang ada di parent class nya
 */
open class Employee(val name: String) {

    // Function Overriding
    open fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }

}

// Inheritance harus open class dari parentnya
open class Manager(name: String) : Employee(name) {

    // Function Overriding
    final override fun sayHello(name: String) {
        println("Hello $name, my name is Manager ${this.name}")
    }

}

class SupperManager(name: String) : Manager(name) {
// Error karena function manager dibuat final
//    override fun sayHello(name: String) {
//        println("Hello $name, my name is Super Manager ${this.name}")
//    }
}

class VicePresident(name: String) : Employee(name) {

    // Function Overriding
    override fun sayHello(name: String) {
        println("Hello $name, my name is Vice President ${this.name}")
    }

}