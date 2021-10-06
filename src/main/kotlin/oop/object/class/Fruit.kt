package oop.`object`.`class`

data class Fruit(val total: Int) {
    // Operator Overloading
    operator fun plus(fruit: Fruit): Fruit {
        return Fruit(total + fruit.total)
    }
}