package oop.`object`.`class`

import kotlin.properties.Delegates

class Account(description: String = "Kosong") { // Constructor
    //    val boss: String = "Dani" // ini namanya eager aka langsung dan tidak malas
    val name: String by lazy {
        println("Namea is called")
        "Dani"
    }

    var description: String by Delegates.observable(description) { property, oldValue, newValue ->
        println("${property.name} is changed from $oldValue to $newValue")
    }
}