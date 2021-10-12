package collection

fun main() {
    listOf("Dani", "Setiawan", "Gandes", "Salindri").forEach {
        println(it)
    }

    mutableListOf("Dani Setiawan", "Gandes Salendri").forEachIndexed { index, value ->
        println("$index : $value")
    }
}