package basic

infix fun String.to(type: String): String {
    return if (type == "UP") {
        this.uppercase()
    } else {
        this.lowercase()
    }
}

fun main() {
    val result: String = "Dani" to "UP"
    val result1: String = "DANI SETIAWAN" to "LO"

    println(result)
    println(result1)
}