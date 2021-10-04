package oop.`object`.`class`

interface Interaction {
    val name: String
    fun supDude(name: String)
}

// Concrete function tidak wajib untuk dibuat ulang di child Class nya
interface Kongkrit {
    val name: String
    fun sayHello(name: String) {
        println("eya eya $name, my name is ${this.name}")
    }
}

// Multiple Inheritance
interface Go : Kongkrit { // Namun interface tidak bisa melakukan inheritance dengan Class
    fun go() {
        println("Go!")
    }
}

// Child Class
class Human(override val name: String) : Interaction {
    override fun supDude(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}

// Konflik di interface
interface MoveA {
    fun move() = println("Move A")
}

interface MoveB {
    fun move() = println("Move B")
}

// Child Class
class Crush(override val name: String) : Go, MoveA, MoveB {
    // Memperbaiki konflik di interface
    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
    }
}