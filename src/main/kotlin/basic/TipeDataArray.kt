package basic

fun main() {
    val members: Array<String> = arrayOf("Dani", "Setiawan", "Maya", "Triyanti")
    val balances: Array<Int> = arrayOf(10_000, 20_000)

    val dani: String = members[0]
    val setiawan: String = members[1]
    val maya: String = members[2]
    val triyanti: String = members[3]

    println(members[0])
    println(balances[0])

    println(members.size)
    println(maya)

    members[0] = "Abi"
    val abi: String = members[0]
    println(members[0])

    balances[0] = 30_000
    val newBalances: Int = balances[0]
    println(newBalances)

}