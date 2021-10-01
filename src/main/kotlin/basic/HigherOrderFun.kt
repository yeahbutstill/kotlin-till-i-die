package basic

fun hello(value: String, transformer: (String) -> String): String {
    val nameTransform = transformer(value)
    return "Hello $nameTransform"
}

fun main() {
    val upperTransformer = { value: String -> value.uppercase() }
    val lowerTransformer = { value: String -> value.lowercase() }
    println(hello("dani", upperTransformer))
    println(hello("DANI", lowerTransformer))
    println(hello("Yeahelah", { value: String -> value.uppercase() }))

    // Trailing Lambda
    val result1 = hello("AAA") { nilai: String ->
        nilai.uppercase()
    }
    println(result1)
}