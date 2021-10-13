package collection

fun main() {
    val list: List<Pair<String, String>> = listOf(
        "Dani" to "Back-End",
        "Dani" to "Full-stack",
        "Gandes" to "My Wife"
    )

    val pair: Pair<List<String>, List<String>> = list.unzip()
    println(pair.first)
    println(pair.second)

    val (list1, list2) = list.unzip()
    println(list1)
    println(list2)

}