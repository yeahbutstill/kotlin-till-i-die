package ini.generic.app

import ini.generic.data.Fruit

fun main() {
    val fruit1 = Fruit("Mangga", 10)
    val fruit2 = Fruit("Mangga", 100)

    println(fruit1 > fruit2)
    println(fruit1 < fruit2)
}