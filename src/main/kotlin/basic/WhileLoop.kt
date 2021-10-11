package basic

fun condition(i: Int) = i < 100

fun main() {
    var a = 0
    while (a < 10) {
        println("While loop $a")
        a++
    }

    var i = 0
    while (condition(i)) {
        print(".")
        i += 10
    }
}