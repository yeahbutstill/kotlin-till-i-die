package app

import annotations.NotBlank
import exception.ValidationException
import oop.`object`.`class`.CreateCategoryReq
import oop.`object`.`class`.CreateProductReq
import kotlin.reflect.full.findAnnotation

fun validateReq(request: Any) { // Menerima Class apapun, yang penting dia punya properti dari annotation NotBlank
    // Untuk dapat informasi dari Class nya
    val clazz = request::class
    val properties = clazz.members

    // iterate satu satu, lalu check kalo ada annotation @NotBlank
    for (property in properties) {
        if (property.findAnnotation<NotBlank>() != null) {
            // Jangan sampai kita konversi seperti ini
//          val value: String = property.call(request) as String // call itu artinya ambil property ini dari objek mana
//          if ("" == value) {
//              throw ValidationException("${property.name} is Blank")
//          }

            when (val value = property.call(request)) {
                is String -> {
                    if ("" == value) {
                        throw ValidationException("${property.name} is blank")
                    }
                }
            }
        }
    }
}

fun main() {
    val request = CreateProductReq("1", "Indomie", 3_000)
    validateReq(request)
    println(request)

    val request1 = CreateCategoryReq("1", "Makanan Siap Saji")
    validateReq(request1)
    println(request1)
}