package basic

fun test(name: String, param: (String) -> Unit): Unit = param(name)

fun main() {
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (j == 10) {
                break@loopI
            }
            println("$i x $j = ${i * j}")
        }
    }

    test("dani") testLabel@{
        if (it == "dani") {
            return@testLabel
        }
    }
    println("dani")
}