package basic

inline fun hello(name: () -> String): String {
    return "Hello ${name()}"
}

inline fun hello1(
    namaHewan: () -> String,
    noinline jenisHewan: () -> String
): String {
    return "Ini hewan ${namaHewan()} ${jenisHewan()}"
}

fun main() {
    println(hello { "Dani" })
    println(hello { "Setiawan" })

    println(hello1({ "Kucing" }, { "Berbulu" }))
}