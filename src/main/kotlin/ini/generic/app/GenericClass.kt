package ini.generic.app

import ini.generic.data.MyData

fun main() {
    val myData: MyData<String> = MyData<String>("Dani")
    myData.printData()
    myData.getData()
}