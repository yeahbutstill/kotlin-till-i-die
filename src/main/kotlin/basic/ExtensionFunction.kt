package basic

fun String.hello(): String {
    return "Hello $this"
}

fun String.printHello(): Unit = println("$this sup dude!")

fun main() {
    val name = "Dani"
    val hello: String = name.hello()

    println(hello)

    name.printHello()

    "Tria".printHello()
    "Nova".printHello()
}