package app

import oop.`object`.`class`.User

fun main() {
    val user = User("yeahbutstill", "rahasia")

    user.let {
        println(it.usernameParam)
        println(it.passwordParam)
    }

    user.run {
        println(this.usernameParam)
        println(this.passwordParam)
    }

    // reference object itu sendiri
    user.apply {
        println(this.usernameParam)
        println(this.passwordParam)
    }

    // reference object itu sendiri
    user.also {
        println(it.usernameParam)
        println(it.passwordParam)
    }

    // bukan extension function, jadi tidak bisa digunakan langsung dari objectnya. kita harus memanggil secara manual
    with(user) {
        println(this.usernameParam)
        println(this.passwordParam)
    }
}