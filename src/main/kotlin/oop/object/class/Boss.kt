package oop.`object`.`class`

class Boss(val nameBoss: String) {

    // dengan inner kita bisa mengakses atribute yang ada di boss
    inner class Employee(val name: String) {

        fun hi() {
            println("Hi, my name is $name, and my boss is ${this@Boss.nameBoss}")
        }

    }

}