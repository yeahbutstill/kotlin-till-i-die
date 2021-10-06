package oop.`object`.`class`

class Friend(val name: String)

// Checking for Null
fun sayHello(friend: Friend?) {
    if (friend != null) {
        println("Hello ${friend.name}")
    }
}

// Safe Call
fun saySafeCall(friend: Friend?) {
    println("Hello ${friend?.name}")
}

// Elvis Operator
fun sayElvisOperator(friend: Friend?) {
    val name = friend?.name ?: ""
    println("Hello $name")
}