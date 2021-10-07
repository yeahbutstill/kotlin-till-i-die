package ini.generic.data

open class Employee
class Manager : Employee()
class VicePresident : Employee()
// Defaultnya adalah <T: Any> . Jika ingin membatasi yang boleh hanya turunannya, ganti dengan Employee
class Company<T: Employee>(val employee: T)