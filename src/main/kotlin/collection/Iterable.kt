package collection

fun <T> displayIterable(iterable: Iterable<T>) {
    val iterator = iterable.iterator()
    while (iterator.hasNext()) println(iterator.next())
}

fun main() {
    displayIterable(listOf("Dani", "Setiawan", "Gandes", "Salendri"))
    displayIterable(setOf("Dani", "Setiawan", "Gandes", "Salendri"))
}