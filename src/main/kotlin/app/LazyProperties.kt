package app

import oop.`object`.`class`.Account

/**
 * Lazy itu diakan muncul ketika emang beneran dipanggil
 * kalau emang engga dicall propertiesnya dia tidak akan dipanggil lambda lazy nya
 */
fun main() {
    val account = Account()
    println(account.name)
    println(account.name)
    println(account.name)

    val accountLazy = Account()
}