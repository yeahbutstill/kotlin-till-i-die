package oop.`object`.`class`

class Person(firstNameParam: String,
             middleNameParam: String?, lastNameParam: String) { // Constructor

    init {
        println("Manusia buatan bernama : $firstNameParam dibuat") // Initializer ini akan selalu dieksekusi pada objek dibuat
    }

    var firstName: String = firstNameParam
    var middleName: String? = middleNameParam
    var lastName: String = lastNameParam

}