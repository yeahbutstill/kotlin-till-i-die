package collection

import collection.data.Member

fun main() {
    val list: List<List<String>> = listOf(
        listOf("Dani Setiawan", "Gandes Salindri"),
        listOf("Back-End", "Full-Stack")
    )

    val listString: List<String> = list.flatten()
    println(listString)

    val members: List<Member> = listOf(
        Member("Dani", listOf("Reading", "Gaming")),
        Member("Gandes", listOf("Sport", "Traveling"))
    )

    val hobi: List<String> = members.flatMap { it.hobi }
    println(hobi)
}