package ini.generic.app

import ini.generic.data.Container
import ini.generic.data.copy

fun main() {
    val data1 = Container("Data1")
    val data2: Container<Any> = Container("Data2")
    copy(data1, data2)

    // Ini akan jadi sama semua karena kita copy
    println(data1.data)
    println(data2.data)
}