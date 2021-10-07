package ini.generic.data

class Container<T>(var data: T)

// Covariant dengan menabahkan out
fun copy(
    from: Container<out Any>,
    to: Container<in Any>
) { // Contravariant dengan nambahkan in di function parameter seperti ini
    to.data = from.data
}