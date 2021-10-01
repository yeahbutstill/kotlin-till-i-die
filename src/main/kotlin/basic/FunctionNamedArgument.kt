package basic

fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
) {
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    fullName(
        firstName = "Dani",
        middleName = "Setiawan",
        lastName = "SKOM"
    )
}