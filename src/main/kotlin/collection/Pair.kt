package collection

fun main() {
    val pair1: Pair<String, String> = Pair("Dani", "Setiawan")
    println(pair1.first)
    println(pair1.second)

    val pair2: Pair<String, String> = "Dani" to "Setiawan"
    println(pair2.first)
    println(pair2.second)
}