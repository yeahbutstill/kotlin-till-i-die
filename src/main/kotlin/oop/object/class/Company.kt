package oop.`object`.`class`

class Company(val name: String) {

    // Dengan hashCode
    override fun hashCode(): Int {
        return name.hashCode()
    }

    // Dengan equals
    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Company -> this.name == other.name
            else -> false
        }
    }
}