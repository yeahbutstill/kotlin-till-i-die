package basic

fun isClose(hour: Int) {
    val open = 9
    val close = 20
    println("Operation hour: $open - $close")
    val status = hour < open || hour >= close
    println("Close: $status")
}

fun main() = isClose(6)
