package basic

fun main() {

    val result2 = 10.0 / 3.0
    println(result2)

    val result = 10 / 2
    println(result)

    val result1 = 10 + (10 / 2)
    println(result1)

    // Augmented Assignments
    var total = 0 // mutable bisa diubah nilainya
    val barang = 100 // immutable tidak bisa diubah nilainya
    total += barang // total = total + barang
    val barang1 = 100
    total += barang1
    println(total)
    val barang2 = 100
    total += barang2

    // Unary Operator
    total++ // total = total + 1
    println(total)

    val suhu = -5
    println(suhu)

    val sehat = true
    println(!sehat)

}