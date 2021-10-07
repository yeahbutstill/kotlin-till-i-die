package app

import exception.ValidationException

fun validationAndSayHello(namaDepan: String?, namaBelakang: String?) {
    if (namaDepan!!.isBlank()) {
        // throw exception secara auto program kita akan terhenti
        throw ValidationException("Name is blank")
    } else if (namaBelakang!!.isBlank()) {
        throw NullPointerException()
    } else {
        println("Hello $namaDepan $namaBelakang")
    }
}

fun main() {
    // throw
//    validationAndSayHello("Dani")
//    validationAndSayHello("")

    // TryCatch
    try {
        validationAndSayHello("Danil", "Setiawan")
        // disini akan berakhir lalu akan masuk ke block catch
        validationAndSayHello("", "")
        // jadi disini tidak akan di exe
        validationAndSayHello(null, null)
        println("Panggil aku")
    } catch (error: ValidationException) {
        println("Terjadi Error ${error.message}")
    } catch (error: NullPointerException) { // Multiple Catch
        println("Error with message ${error.message}")
    } finally { // ini cocok untuk menempatkan kode yang memang harus dilakukan tidak peduli baik itu sukses atau gagal
        println("Program selesai")
    }
    // finally cocok sekali untuk menutup koneksi ke database biar tidak bengkak koneksinya
}