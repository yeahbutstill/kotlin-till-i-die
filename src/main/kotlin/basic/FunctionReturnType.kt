package basic

fun sum(a: Int, b: Int): Int {
    val total = a + b
    return total
}

fun bagi(c: Int, d: Int): Int {
    if (d == 0) {
        return 0
    } else {
        val result1 = c / d
        return result1
    }
}

fun main() {
    val result = sum(10, 10)
    println(result)

    println(bagi(100, 10))
    println(bagi(100, 0))
}