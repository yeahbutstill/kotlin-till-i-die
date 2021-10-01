package basic

fun main() {
    // Biasa Non Recursive
    fun factorialLoop(value: Int): Int {
        var result = 1
        for (i in value downTo 1) {
            result *= i
        }
        return result
    }

    println(factorialLoop(10))

    // Nih baru Recursive Fun
    fun factorialRecursive(value1: Int): Int {
        return when (value1) {
            1 -> 1
            else -> value1 * factorialRecursive(value1 - 1)
        }
    }

    println(factorialRecursive(10))
}