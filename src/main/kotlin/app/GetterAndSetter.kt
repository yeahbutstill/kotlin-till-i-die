package app

import oop.`object`.`class`.BigNote
import oop.`object`.`class`.Note

fun main() {
    val note = Note("Belajar Kotlin")
    println(note.title)

    note.title = ""
    println(note.title)

    val bigNote = BigNote("Belajar Kotlin Get")
    println(bigNote.title)
    println(bigNote.bigTitle)

}