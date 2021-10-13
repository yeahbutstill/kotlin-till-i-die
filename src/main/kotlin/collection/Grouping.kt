package collection

fun main() {
    val list = listOf("a", "b", "c", "a", "b", "c", "d", "aa", "cc", "aa", "bb", "abcd")
    val map: Map<String, List<String>> = list.groupBy { value ->
        value
    }
    println(map)

    val map1: Map<Int, List<String>> = list.groupBy { value ->
        value.length
    }
    println(map1)

    val grouping: Grouping<String, String> = list.groupingBy { it }
    println(grouping)
}