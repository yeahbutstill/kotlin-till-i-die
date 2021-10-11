package collection

fun <T> displayCollection(collection: Collection<T>) {
    for (element in collection) {
        println(element)
    }
}

fun main() {
    displayCollection(listOf("Dani", "Setiawan"))
    displayCollection(mutableListOf("Dani", "Setiawan"))
    displayCollection(setOf("Daani", "Setiawan"))
    displayCollection(mutableSetOf("Gandes", "Salendri"))
    displayCollection(mapOf("Gandes" to "Salendri").entries) // sebenernya map itu bukan turunan collection, jadi ngakalinnya balikin dia menjadi set dengan entries

}