package collection

fun <T> displayMutableIterable(iterable: MutableIterable<T>) {

    val iterator = iterable.iterator()
    while (iterator.hasNext()) {
        val value = iterator.next()
        println(value)
    }

}

fun main() {
    displayMutableIterable(mutableListOf("Dani", "Setiawan", "Gandes", "Salendri"))
    displayMutableIterable(mutableSetOf("Dani", "Setiawan", "Gandes", "Salendri"))
}