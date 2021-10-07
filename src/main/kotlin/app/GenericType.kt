package app

// T itu penanda kalau ini generic type
data class GenericType<T>(val data: T)

fun main() {
    val dataString = GenericType("Dani")
    val valueString: String = dataString.data
    println(valueString)

    val dataInt = GenericType(10)
    val valueInt: Int = dataInt.data
    println(valueInt)
}