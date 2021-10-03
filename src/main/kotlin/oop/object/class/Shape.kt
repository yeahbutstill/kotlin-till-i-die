package oop.`object`.`class`

open class Shape {
    open val corner: Int = -1
    open fun printName() {
        println("This is Shape")
    }
}

class Rectangel : Shape() {
    override val corner: Int = 4
    val parentCorner: Int = super.corner

    override fun printName() {
        println("This is Rectangel, with parent =>")
        super.printName()
    }
}

class Triangle : Shape() {
    override val corner: Int = 5
}