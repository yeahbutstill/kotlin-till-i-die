package basic

fun isOpen1(hour: Int) {
    val open = 9
    val closed = 20
    println("Operation hours: $open - $closed")
    val status = if (hour >= open && hour < closed)
        true
    else
        false
    println("Open: $status")
}

fun main() = isOpen1(9)