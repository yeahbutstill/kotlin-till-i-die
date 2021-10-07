package ini.generic.app

import ini.generic.data.Function
import ini.generic.data.MyData

fun main() {
    val myData: MyData<String, Int> = MyData("Dani", 28)
    myData.printData()
    myData.getData()

    val myDataInt: MyData<Int, Int> = MyData(12, 20)
    myDataInt.getData()
    myDataInt.printData()

    val function = Function("Dani")
    function.sayHello("Gandes")
    function.sayHello(28)

}