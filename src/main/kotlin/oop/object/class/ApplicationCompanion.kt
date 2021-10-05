package oop.`object`.`class`

class ApplicationCompanion(val name: String) {
    companion object {
        fun menjadiBesar(name: String): String {
            return name.uppercase()
        }
    }
}