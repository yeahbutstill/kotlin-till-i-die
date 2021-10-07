package ini.generic.data

interface CanSayHello {
    fun sayHello(name: String)
}

open class Employee2
class Manager2
class VicePresident2 : Employee2(), CanSayHello {
    override fun sayHello(name: String) {
        println("Hello $name")
    }
}

class Company2<T>(val employee2: T) where T : Employee2, T : CanSayHello