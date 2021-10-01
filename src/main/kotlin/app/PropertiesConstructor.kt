package app

import oop.`object`.`class`.User

fun main() {

    val user = User("dani", "rahasia123")
    val user1 = User("maya", "rahasia321")

    user.usernameParam = "dani setiawan"
    user1.usernameParam = "maya triyanti"

    println(user.usernameParam)
    println(user1.usernameParam)

}