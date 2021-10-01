package basic

fun finalValue(name: String, vararg values: Int) {
    var total = 0.0
    for (value in values) {
        total += value
    }
    total /= values.size
    println("Final values $name = $total")
}

// Array
fun hitungTotal(nilais: Array<Int>): Int {
    var jumlah = 0
    for (nilai in nilais) {
        jumlah += nilai
    }
    return jumlah
}

fun blast(vararg angkas: Int): Int {
    var dontMove = 0
    for (angka in angkas) {
        dontMove += angka
    }
    return dontMove
}

fun main() {
    finalValue("Dani", 10, 20)

    val nilais = arrayOf(10, 10, 10, 10)
    val result = hitungTotal(nilais)
    println("Jumlahnya adalah : $result")

    val result1 = blast(10, 10, 10)
    println(result1)
}