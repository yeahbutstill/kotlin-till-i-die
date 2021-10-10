package collection

fun main() {
    val mutableList: MutableList<String> = mutableListOf()
    mutableList.add("Dani")
    mutableList.add("Setiawan")
    mutableList.add("Siapa nih?")
    println(mutableList)
    println(mutableList.isEmpty())

    mutableList[1] = "Maya"
    mutableList.remove("Siapa nih?")

    for (value in mutableList) {
        println(value)
    }

}