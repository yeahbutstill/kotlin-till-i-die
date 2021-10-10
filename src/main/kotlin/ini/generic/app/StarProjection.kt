package ini.generic.app

// * tidak peduli tipenya apa
fun displayLength(array: Array<*>) {
    println("Total array is ${array.size}")
}

fun main() {
    val arrayInt: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6)
    val arrayStr: Array<String> = arrayOf("Dani", "Setiawan", "Gandes", "Salindri")
    displayLength(arrayInt)
    displayLength(arrayStr)

}