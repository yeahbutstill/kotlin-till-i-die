package annotations

@Target(AnnotationTarget.CLASS) // cuman bisa ditambahkan di Class
@Retention(AnnotationRetention.RUNTIME) // bisa dibaca sama reflection
@MustBeDocumented
annotation class Fancy(val author: String)
