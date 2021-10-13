package collection

fun main() {
    val list = listOf("Gandes", "Salindri", "Dani", "Setiawan")
    println(list.any { it.length > 5 })
    println(list.none { it.length > 5 })
    println(list.all { it.length > 5 })
    println(list.any())
    println(list.none())
}