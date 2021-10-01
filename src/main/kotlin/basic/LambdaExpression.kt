package basic

fun toUpper(nilai: String): String = nilai.uppercase()

fun main() {
    // Membuat lambda
    val lambdaName: (String, String) -> String = { firstName: String,
                                                   lastName: String ->
        val value = "$firstName $lastName"
        value
    }

    val name = lambdaName("Dani", "Setiawan")
    println(name)

    // It hanya bisa 1 paremeter
    val baba: (String) -> String = {
        it.uppercase()
    }
    val aaa = baba("yeah")
    println(aaa)

    // Method References membuat lamda dari fun yang sudah ada
    val namaLambda: (String) -> String = ::toUpper
    val nilaiLambda = namaLambda("DDDDDDAAAAAAA")
    println(nilaiLambda)
}