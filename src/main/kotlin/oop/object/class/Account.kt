package oop.`object`.`class`

class Account {
    val boss: String = "Dani" // ini namanya eager aka langsung dan tidak malas
    val name: String by lazy {
        println("Namea is called")
        "Dani"
    }
}