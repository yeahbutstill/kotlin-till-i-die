package basic

fun main() {
    val examValue = 90

    if (examValue > 90) {
        println("Nice")
    } else if (examValue > 75) {
        println("Good job")
    } else if (examValue > 60) {
        println("Not bad")
    } else {
        println("Try again next year")
    }
}