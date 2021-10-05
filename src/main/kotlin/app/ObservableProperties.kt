package app

import oop.`object`.`class`.Account

// Kita bisa menditek perubahan terhadap sebuah properties menggunakan Observable Properties
fun main() {
    val account = Account()
    account.description = "Dani"
    account.description = "Berubah"
    account.description = "Sup Dude"

}