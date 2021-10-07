package ini.generic.data

/**
 * My data
 *
 * @param T
 * @property dataPertama
 * @constructor Create empty My data
 *
 *
 * E - Element(biasa digunakan di collection atau struktur data)
 * K - key
 * N - Number
 * T - Type
 * V - Value
 * S,U,V etc - 2nd, 3rd, 4th types
 */
class MyData<T, U>(private val dataPertama: T, private val secondData: U) {
    fun printData() {
        return println("Data is $dataPertama $secondData")
    }

    fun getData(): T {
        return dataPertama
    }

    fun getDataSecond(): U {
        return secondData
    }
}