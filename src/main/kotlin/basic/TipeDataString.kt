package basic

fun main() {
    var firstName: String = "Dani"
    var lastName: String = "Setiawan"

    var address: String = """
        Street Sunan Ampel 2, 
        Province Bojong Gede,
        Country Indonesia
        """
    var address1: String = """
        Street Sunan Ampel 2, 
        Province Bojong Gede,
        Country Indonesia
    """.trimIndent()

    var address2: String = """
        |Street Sunan Ampel 2, 
        |Province Bojong Gede,
        |Country Indonesia
    """.trimMargin()

    var address3: String = """
        >Street Sunan Ampel 2, 
        >Province Bojong Gede,
        >Country Indonesia
    """.trimMargin(">")

    println(firstName)
    println(lastName)
    println(address)
    println(address1)
    println(address2)
    println(address3)

    var fullName: String = firstName + " " + lastName
    println(fullName)

    // String Template
    var namaLengkap: String = "$firstName $lastName"
    var desc: String = "Total $namaLengkap char = ${namaLengkap.length}"
    println(namaLengkap)
    println(desc)

}