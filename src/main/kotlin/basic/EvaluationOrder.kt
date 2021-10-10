package basic

fun main() {
    val sunny = true
    val hourSleep = 6
    val exercise = false
    val temp = 55

    val happy1 = sunny && temp > 50 ||
            exercise && hourSleep > 7
    println(happy1)

    val sameHappy1 = (sunny && temp > 50) ||
            (exercise && hourSleep > 7)
    println(sameHappy1)

    val notSame =
        (sunny && temp > 50 || exercise) &&
                hourSleep > 7
    println(notSame)
}