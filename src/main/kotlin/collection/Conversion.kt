package collection

fun main() {
    val array = arrayOf(4, 2, 1, 6, 5, 3, 7, 9, 8, 10)
    val range = 1..100

    val list = array.toList()
    val set = array.toSet()

    val mutableSet = range.toMutableSet()
    val mutableList = range.toMutableList()

    val sortedSet = array.toSortedSet()
}