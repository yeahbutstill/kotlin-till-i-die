package oop.`object`.`class`

data class Login(val user: String, val pass: String)
typealias LoginCallBack = (Login) -> Boolean
