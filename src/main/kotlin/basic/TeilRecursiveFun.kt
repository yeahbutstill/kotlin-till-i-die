package basic

fun main() {
    tailrec fun display(value: Int) {
        println(value)
        if (value > 0) {
            display(value - 1)
        }
    }
    display(10)

    tailrec fun factorialRecursive(value1: Int, total: Int = 1): Int {
        return when (value1) {
            1 -> total
            else -> factorialRecursive(value1 - 1, total * value1)
        }
    }
    println(factorialRecursive(10))
}
