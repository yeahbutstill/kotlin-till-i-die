package basic

fun main() {
    var a = 0
    do {
        println("While Loop $a")
        a++
    } while (a < 10)

    var i = 0
    do {
        print(".")
        i += 10
    } while (condition(i))
}