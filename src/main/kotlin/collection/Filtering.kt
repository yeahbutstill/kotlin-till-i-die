package collection

fun main() {
    val list = listOf("Dani", "Setiawan", "Gandes", "Salindri")
    val list1 = list.filter { it.length > 5 }
    println(list1)

    val list2 = list.filterIndexed { index, value -> index % 2 == 0 }
    println(list2)

    val list3: List<Any?> = listOf(null, 1, "Dani", "Setiawan", 2, null)
    val listString = list3.filterIsInstance<String>()
    println(listString)

    val listInt = list3.filterIsInstance<Int>()
    println(listInt)

    val listNotnull = list3.filterNotNull()
    println(listNotnull)

}