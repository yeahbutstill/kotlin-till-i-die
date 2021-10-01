package basic

fun main() {
    val finalExam = 'A'
    when (finalExam) {
        'A' -> println("Amazing")
        'B' -> println("Good")
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        'E' -> println("Try Again Next Year")
        else -> println("Woo")
    }

    // Multiple Option
    val buah = "Apel"
    when (buah) {
        "Apel", "Mangga", "Jeruk" -> println("Pass")
        else -> {
            println("Not Pass")
        }
    }

    // In
    val myLove = "Mom"
    val passValue = arrayOf("Mom", "Dad", "Wife")
    when (myLove) {
        in passValue -> println("Pass")
        !in passValue -> println("Try Again")
    }

    // Is
    val name = "Dani"
    when (name) {
        is String -> println("This is String")
        !is String -> println("This is not String")
    }

    val blabla = 90
    when {
        blabla > 80 -> println("Good Job")
        blabla > 60 -> println("Not Bad")
        else -> println("Try Again Next Year")
    }
}