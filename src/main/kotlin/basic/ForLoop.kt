package basic

fun main() {
    var total = 0
    val names = arrayOf("Dani", "Setiawan", "Software Enginer")
    for (name in names) {
        println(name)
        total++
    }
    println("Total perulangan = $total")

    for (value in 0..100) {
        println(value)
    }

    for (value in 1000 downTo 0 step 5) {
        println(value)
    }

    // Kombinasi range dengan array
    val ukuranArray = names.size - 1
    for (i in 0..ukuranArray) {
        println(names[i])
        println("Index $i = ${names[i]}")
    }
}