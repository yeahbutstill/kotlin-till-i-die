package collection

fun main() {
    val list = listOf("Dani", "Setiawan", "Gandes", "Salindri")
    val list1 = list + "Back-End"
    println(list1)

    val list2 = list1 + listOf("Programmer", "Engineer", "UX")
    println(list2)

    val list3 = list2 - "UX"
    println(list3)

    val list4 = list2 - listOf("Engineer", "Programmer", "UI")
    println(list4)

    val map1 = mapOf("a"  to "Dani", "b" to "Gandes")
    val map2 = map1 + Pair("c", "Setiawan")
    println(map2)

    val map3 = map1 - "a"
    println(map3)
}
