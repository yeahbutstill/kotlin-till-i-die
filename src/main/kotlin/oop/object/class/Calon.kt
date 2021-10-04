package oop.`object`.`class`

class Calon(val name: String, val age: Int)

// Extension Function
fun Calon?.sayangAkoh(name: String) {
    if (this != null) {
        println("Aku ${this.name} umur aku ${this.age} tahun")
        println("Lagi pada ngapain sih kalau boleh tau nih $name")
    }
}

// Extension Properties
val Calon.upperName: String
    get() = this.name.uppercase()