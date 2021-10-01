package basic

fun main() {
    val range = 1..100
    println("Range")
    println(range.count())
    println(range.contains(50))
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)
    println()

    val rangeTerbalik = 1000 downTo 1
    println("Down TO")
    println(rangeTerbalik.count())
    println(rangeTerbalik.contains(50))
    println(rangeTerbalik.contains(200))
    println(rangeTerbalik.first)
    println(rangeTerbalik.last)
    println(rangeTerbalik.step)
    println()

    // Range Dengan Step (kenaikan)
    val range1 = 1..100 step 5
    val range2 = 100 downTo 1 step 2

    println("Step")
    println(range1.count())
    println(range1.contains(50))
    println(range1.contains(200))
    println(range1.first)
    println(range1.last)
    println(range1.step)
    println()

    println("Step")
    println(range2.count()) // jumlah data
    println(range2.contains(50))
    println(range2.contains(200))
    println(range2.first)
    println(range2.last)
    println(range2.step)
}