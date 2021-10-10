package basic

fun bmiEnglish(
    weight: Int,
    height: Int
): String {
    val bmi = 703.07 * weight / (height * height)  // [1]
    return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
}

fun main() {
    val weight = 150
    val height = 60
    val status = bmiEnglish(weight, height)
    println(status)
}