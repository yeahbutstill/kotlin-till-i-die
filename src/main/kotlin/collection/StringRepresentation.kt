package collection

fun main() {
    val list: List<String> = listOf("Dani", "Setiawan", "Gandes", "Salindri")

    val string: String = list.joinToString(" ", "|", "|")
    println(string)

    val string1: String = list.joinToString(" ", "|", "|") {
        it.uppercase()
    }
    println(string1)

    val builder = StringBuilder()
    list.joinTo(builder, " ", "|", "|")
    list.joinTo(builder, " ", ">", "<")
    list.joinTo(builder, " ", "@", "@")
    val string2 = builder.toString()
    println(string2)

    val number: List<Int> = (1..100).toList()
    println(number.joinToString())
}