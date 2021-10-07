package ini.generic.data

class Invariant<T>(val data: T)

fun main() {
    val data1: Invariant<String> = Invariant("Dani")
    data1.run {
        println(this.data)
    }
//    val data2: Invariant<Any> = data1 // error bahaya dah pokoknya
//    data2.data = 100

}