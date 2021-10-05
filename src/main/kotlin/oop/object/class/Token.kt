package oop.`object`.`class`

/**
 * Token
 *
 * @constructor Create empty Token
 *
 * Membuat Inline Class
 */
@JvmInline
value class Token(val value: String) {
    fun menjadiBesar(): String = value.uppercase()
}