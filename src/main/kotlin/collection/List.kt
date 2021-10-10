package collection

fun main() {
    val list: List<String> = listOf("Dani", "Setiawan")
    println(list[0])
    println(list[1])
    println(list.indexOf("Dani"))
    println(list.indexOf("tidak ada"))
    println(list.contains("Setiawan"))
    println(list.contains("tidak ada"))
    println(list.containsAll(listOf("Dani", "Setiawan")))
    println(list.isEmpty())
    println(list.isNotEmpty())
}