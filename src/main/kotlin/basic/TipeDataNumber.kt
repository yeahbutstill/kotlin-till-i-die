package basic

fun main() {

    // Tipe Integer (bulat)
    var age: Byte = 30
    var height: Int = 170
    var distance: Short = 2000
    var balance: Long = 100000000L

    println(age)

    // Tipe Floating Point (pecahan)
    var value: Float = 98.98F
    var radius: Double = 232423423.454535

    println(value)

    // Literals
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b0001

    println(hexadecimalLiteral)

    // Underscore In Number
    var harga: Int = 1_700_000

    println(harga)

    // Conversion
    var number: Long = 100_000_000_000L
    var numberInt: Int = number.toInt()

    println(numberInt)
}