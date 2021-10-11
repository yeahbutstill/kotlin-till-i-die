package collection

fun <T> displayMutableCollection(collection: MutableCollection<T>) {
    for (element in collection) {
        println(element)
    }
}

fun main() {
    displayMutableCollection(mutableListOf("Dani", "Setiawan"))
    displayMutableCollection(mutableSetOf("Dani", "Setiawan"))
    displayMutableCollection(mutableMapOf("Dani" to "Setiawan").entries)
}