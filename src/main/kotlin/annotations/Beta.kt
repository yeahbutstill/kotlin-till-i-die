package annotations

@Target(
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.FIELD
)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Beta()

class ExampleTarget(
    @field:Beta val namaDepan: String,
    @get:Beta val namaTengah: String,
    @param:Beta val namaBelakang: String
)