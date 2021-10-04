package oop.`object`.`class`

class Company(val name: String) {
    // Dengan Equals
    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Company -> this.name == other.name
            else -> false
        }
    }
}