package ini.generic.data

// Generic Function tapi hanya bisa diakses di function tersebut. tidak bisa digunakan di luar function
class Function(val name: String) {
    // ini cocok jika kita ingin membuat generic function, tanpa harus mengubah deklarasi class
    fun <T> sayHello(param: T) {
        println("Hello $param, my name is $name")
    }
}