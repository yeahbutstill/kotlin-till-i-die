package collection

fun main() {
    val mutableMap: MutableMap<String, String> = mutableMapOf()
    mutableMap["a"] = "Dani"
    mutableMap["b"] = "Setiawan"
    mutableMap["c"] = "Gandes"
    mutableMap["d"] = "Salendri"

    println(mutableMap["a"])
    println(mutableMap["b"])
    println(mutableMap.getOrDefault("e", "Tidak ada"))
    println(mutableMap.get("e"))

    mutableMap.remove("a")

    for ((key, value) in mutableMap) {
        println("$key to $value")
    }
}