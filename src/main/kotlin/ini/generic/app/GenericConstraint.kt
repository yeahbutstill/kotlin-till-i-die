package ini.generic.app

import ini.generic.data.*

fun main() {
    val data1 = Company(Employee())
    val data2 = Company(Manager())
    val data3 = Company(VicePresident())

    // Where keyword
//    val data4 = Company2(Manager2()) // error CanSayHello
    val data5 = Company2(VicePresident2())
//    val data6 = Company2(Employee2()) // error CanSayHello
//    val data7 = Company2("String") // error not Employee
}