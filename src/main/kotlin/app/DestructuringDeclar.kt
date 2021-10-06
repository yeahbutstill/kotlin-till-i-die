package app

import oop.`object`.`class`.*

fun minmax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value1, value2)
        else -> MinMax(value1, value2)
    }
}

fun login(login: Login, callback: LoginCallBack): Boolean {
    return callback(login)
}

fun topup(topUp: TopUp, proses: (TopUp) -> Boolean): Boolean {
    return proses(topUp)
}

fun main() {
    val game = Game("Zelda", 700_000)
    val (name, price) = game
    println(game)
    println(name)
    println(price)

    val (min, max) = minmax(100, 1000)
    println(min)
    println(max)

    val login = Login("dani", "rahasia")
    val (user, pass) = login
    println(user)
    println(pass)
    println(login)

    val request = Login("dani", "rahasia")
    val success = login(request) { (user, pass) ->
        user == "dani" && pass == "rahasia"
    }
    println(success)

    val topUp = TopUp(250, 250_000)
    topup(topUp) { (shell, hargaRupiah) ->
        shell == 250 && hargaRupiah == 250_000
    }
    println(topUp)
}