package basic

fun main() {
    val finalExam = 90
    val attendant = 80
    val quiz = 60

    val passFinalExam = finalExam > 70
    val passAttendant = attendant > 70
    val passQuiz = quiz > 70

    val pass = passFinalExam && passAttendant && passQuiz
    val pass1 = passFinalExam && passAttendant || passQuiz

    println(pass)
    println(pass1)
}