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
class MyData<T>(val dataPertama: T) {
    fun printData() {
        return println("Data is $dataPertama")
    }

    fun getData(): T {
        return dataPertama
    }
}