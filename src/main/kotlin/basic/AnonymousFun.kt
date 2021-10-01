package basic

fun main() {
    val anonymousUpper = fun(value: String): String {
        if (value.isBlank()) {
            return "Ups"
        }
        return value.uppercase()
    }
    val result2 = hello("Dani", anonymousUpper)
    println(result2)

    // Anonymous Function as Parameter
    fun hai(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val result1 = hai("May", fun(nilai: String): String {
        if (nilai.isBlank()) {
            return "HHHH"
        }
        return nilai.lowercase()
    })
    println(result1)
}