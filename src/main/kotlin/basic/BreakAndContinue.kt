package basic

fun main() {
    var i = 0
    while (true) {
        println("Break Me $i")
        i++
        if (i > 10) {
            break
        }
    }

    // Continue
    for (a in 1..100) {
        if (a % 2 == 0) {
            continue
        }
        println(a)
    }
}