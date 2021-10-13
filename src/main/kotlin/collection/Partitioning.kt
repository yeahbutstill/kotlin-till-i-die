package collection

fun main() {
    val list: List<String> = listOf("Dani", "Setiawan", "Gandes", "Salindri")
    val pair: Pair<List<String>, List<String>> = list.partition { it.length > 5 }
    val (listMatch, listNotMatch) = list.partition { it.length > 5 }

    println(pair)
    println(listMatch)
    println(listNotMatch)
}