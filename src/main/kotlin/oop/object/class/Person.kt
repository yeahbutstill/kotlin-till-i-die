package oop.`object`.`class`

class Person(
    firstNameParam: String,
    middleNameParam: String?, lastNameParam: String?, ageParam: Int
) { // Primary Constructor

    var firstName: String = firstNameParam
    var middleName: String? = middleNameParam
    var lastName: String? = lastNameParam
    var age: Int = ageParam

    init {
        println("Manusia buatan bernama : $firstNameParam dibuat") // Initializer ini akan selalu dieksekusi pada objek dibuat
    }

    // Secondary Constructor
    constructor(firstNameParam: String, middleNameParam: String?) :
    // Wajib memanggil primary constructor jika ada
            this(firstNameParam, middleNameParam, null, 2021) {
                println("Secondary Constructor")
    }

    constructor(firstNameParam: String) : this(firstNameParam, "") {
        println("Secondary Constructor1")
    }

}