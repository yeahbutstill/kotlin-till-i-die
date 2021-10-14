package collection

fun main() {
    val set = setOf("Dani", "Setiawan", "Gandes", "Salindri")

    println(set.elementAt(0))
    println(set.first())
    println(set.last())
    println(set.elementAtOrNull(2))
    println(set.elementAtOrNull(10))
    println(set.elementAtOrElse(2) { "Tidak ada" })
    println(set.elementAtOrElse(10) { "Tidak ada" })
}