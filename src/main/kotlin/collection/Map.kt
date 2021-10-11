package collection

fun main() {
    val map: Map<String, String> = mapOf(
        Pair("a", "Dani"),
        "b" to "Setiawan",
        "c" to "Gandes",
        "d" to "Salendri"
    )

    for (entry in map) {
        println(entry)
    }
    println(map.size)

    for ((key, value ) in map) {
        println("$key to $value")
    }
}