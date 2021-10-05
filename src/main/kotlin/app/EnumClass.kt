package app

/**
 * Membuat Object Enum Class
 */
import oop.`object`.`class`.Gender

fun main() {
    val man = Gender.MALE
    val women = Gender.FEMALE
    val all: Array<Gender> = Gender.values()

    val manFromString = Gender.valueOf("MALE")
    val womenFromString = Gender.valueOf("FEMALE")

    println(man)
    println(women)
    println(all.toList())

    // Enum Properties dan Function
    man.showDescription()
    women.showDescription()
}