package collection

import collection.data.Person

fun main() {
    val mutableSet: MutableSet<Person> = mutableSetOf()
    mutableSet.add(Person("Dani"))
    mutableSet.add(Person("Setiawan"))
    mutableSet.add(Person("Dani"))

    println(mutableSet.size)
    println(mutableSet.contains(Person("Dani")))

    for (person in mutableSet) {
        println(person)
    }
}