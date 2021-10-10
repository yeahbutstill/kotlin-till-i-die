package ini.generic.app

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class NameWithLog(param: String) {
    val name: String by LogReadOnlyProperties(param)
}

class LogReadOnlyProperties(val data: String) : ReadOnlyProperty<Any, String> {
    private var counter: Int = 0
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Access property ${property.name} with value $data")
        counter++
        return data.uppercase() + counter
    }
}

fun main() {
    val nameWithLog = NameWithLog("Dani Setiawan")

    println(nameWithLog.name)
    println(nameWithLog.name)
}