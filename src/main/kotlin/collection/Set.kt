package collection

import collection.data.Person

fun main() {
    val set: Set<Person> = setOf(
        Person("Dani"), Person("Setiawan"), Person("Dani")
    )

    println(set.size)
    println(set.contains(Person("Dani")))

    for (value in set) {
        println(value)
    }
}
