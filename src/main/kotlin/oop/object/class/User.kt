package oop.`object`.`class`

/**
 * User
 *
 * @property usernameParam
 * @property passwordParam
 * @constructor Create empty User
 *
 * Properties di constructor hanya bisa dilakukan di primary constructor
 */
class User(var usernameParam: String, var passwordParam: String) {

    override fun toString(): String {
        return "User with username = $usernameParam"
    }

}