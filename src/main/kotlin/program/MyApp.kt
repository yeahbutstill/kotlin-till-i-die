package program

import annotations.Fancy

@Fancy(author = "Dani")
class MyApp(val name: String, val version: Int) {
    fun info(): String = "Application $name-$version"
}