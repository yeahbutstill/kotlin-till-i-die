package oop.`object`.`class`

class Student {

    var firstName: String = ""
    var lastName: String = ""

    fun sayHello(firstName: String, lastName: String) {

        // Recomended ketik ingin mengakses properties milik objek itu sendiri gunakan this
        println("Hello $firstName $lastName, my name is ${this.firstName}")
    }

}