package basic

fun main() {
    var sum = 0
    for (n in 10..100) {
        sum += n
        println("$n $sum")
    }
    println("Sum = $sum")
}