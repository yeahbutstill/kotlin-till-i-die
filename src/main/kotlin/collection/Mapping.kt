package collection

fun main() {
    val list: List<String> = listOf("Dani", "Setiawan", "Gandes", "Salendri")

    // Manual
//    val temp = mutableListOf<String>()
//    for (value in list) {
//        temp.add(value.uppercase())
//    }

//    val list2 = list.map { value -> value.uppercase() }
    val list2 = list.map { it.uppercase() }

    val set1 = setOf("Dani", "Setiawan", "Gandes", "Salindri")
    val set2 = set1.map { it.lowercase() }

    println(list2)
    println(set2)

    val namaes = listOf("Dani", "Setiawan", "Gandes", "Salindri", "aaaaaa i love u somuch")
    val namesGanjil = namaes.mapIndexedNotNull { index, name ->
        if (index % 2 == 0) null
        else name
    }
    println(namesGanjil)

    val number = (1..100).toList()
    val ganjil = number.mapNotNull {
        if (it % 2 == 0) null
        else it
    }
    println(ganjil)

}