package basic

fun printSupDude(name: String?): Unit {
    if (name == null) {
        println("Hello Bro")
    } else {
        println("Hello $name")
    }
}

fun main() {
    printSupDude("Maya")
    printSupDude(null)
}