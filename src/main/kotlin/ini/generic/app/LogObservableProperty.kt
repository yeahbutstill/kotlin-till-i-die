package ini.generic.app

import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

class LogObservableProperty<T>(param: T) : ObservableProperty<T>(param) {

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("After change ${property.name} from $oldValue to $newValue")
        super.afterChange(property, oldValue, newValue)
    }

    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("Before change ${property.name} from $oldValue to $newValue")
        return super.beforeChange(property, oldValue, newValue)
    }

}

class Car(brand: String, year: Int) {
    var brand: String by LogObservableProperty(brand)
    var year: Int by LogObservableProperty(year)
    var owner: String by Delegates.notNull()
    var description: String by Delegates.vetoable("") { property, oldValue, newValue ->
        println("Before change ${property.name} from $oldValue to $newValue")
        true
    }
    var other: String by Delegates.observable("") { property, oldValue, newValue ->
        println("After change ${property.name} from $oldValue to $newValue")
    }
}

fun main() {
    val car = Car("Toyota", 2000)
    car.brand = "Honda"
    car.year = 2021

    car.owner = "Dani"
    println(car.owner)

    car.description = "Test1"
    car.other = "Test2"
}