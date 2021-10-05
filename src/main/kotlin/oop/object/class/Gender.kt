package oop.`object`.`class`

/**
 * Gender
 *
 * @constructor Create empty Gender
 *
 * Enum class merupakan representasi dari class yang sudah tetap nilainya
 * seperti jenis kelamin, arah mata angin dan sejenisnya
 */
enum class Gender(val description: String) { // Properties
    MALE("Male"),
    FEMALE("Female");

    // Function
    fun showDescription() {
        println(description)
    }
}