package basic

fun main() {
    var counter: Int = 0
    val lambdaIncrement: () -> Unit = {
        println("Increment")
        counter++
    }

    val anonymousIncrement = fun() {
        println("Anonymous Function Increment")
        counter++
    }

    fun functionIncrement() {
        println("Function Increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)
}