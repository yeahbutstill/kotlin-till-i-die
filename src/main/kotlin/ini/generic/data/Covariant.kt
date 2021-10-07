package ini.generic.data

class Covariant<out T>(val data: T) {
    fun data(): T {
        return data
    }
}

fun main() {
    val data1: Covariant<String> = Covariant("Dani")
    val data2: Covariant<Any> = data1

    println(data2.data())
}