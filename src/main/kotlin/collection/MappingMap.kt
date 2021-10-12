package collection


fun main() {
    val map1: Map<Int, String> = mapOf(
        1 to "Dani",
        2 to "Setiawan",
        3 to "Gandes",
        4 to "Salindri"
    )

    val map2: Map<Int, String> = map1.mapKeys {
        it.key * 10
    }

    val map3: Map<Int, String> = map1.mapValues {
        it.value.uppercase()
    }

    println(map2)
    println(map3)
}
