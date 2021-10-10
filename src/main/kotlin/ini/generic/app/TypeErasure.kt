package ini.generic.app

class TypeErasure<T>(param: T) {
    private val data: T = param
    fun getData(): T = data
}

fun main() {
    val data = TypeErasure("Dani")
    val name = data.getData()
    println(name)

    // Problem Type Erasure
    val dani = data as TypeErasure<Int>
    val number = dani.getData()
    println(number)
}