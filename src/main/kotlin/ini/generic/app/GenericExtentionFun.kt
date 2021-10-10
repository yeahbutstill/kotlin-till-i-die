package ini.generic.app

class Data<T>(val data: T)

fun Data<String>.cetak() {
    val data: String = this.data
    println(data)
}

fun main() {

    val data2 = Data("Test")

    data2.cetak()
}