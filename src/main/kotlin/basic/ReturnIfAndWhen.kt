package basic

fun main() {
    fun helloSay(name: String = ""): String {
        return if (name == "") {
            "Hello Bro"
        } else {
            "Hello $name"
        }
    }

    println(helloSay())
    println(helloSay("Dani"))

    fun whemHello(name1: String = ""): String {
        return when (name1) {
            "" -> "Hello Bro"
            else -> "Hello $name1"
        }
    }

    println(whemHello())
    println(whemHello("Danil"))
}