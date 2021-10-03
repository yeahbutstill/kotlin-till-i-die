package oop.`object`.`class`

open class Shape {
    open val corner: Int = -1
}

class Rectangel : Shape() {
    override val corner: Int = 4
}

class Triangle : Shape() {
    override val corner: Int = 5
}