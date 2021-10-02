package oop.`object`.`class`

class Car {

    var brand: String = ""
    var year: Int = 2021

    fun sayHello(yourName: String) {
        println("Hello $yourName, di tahun $year saya baru saja membeli $brand")
    }

    // Function Overloading
    fun sayHello(yourNameParam: String, lastNameParam: String) {
        println("Hello $yourNameParam $lastNameParam, di tahun $year saya baru saja membeli $brand")
    }

    fun run() {
        println("Berjalan sangat kencang")
    }

    fun getCars(): String {
        return "$brand $year"
    }

}