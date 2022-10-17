package generic

fun main() {

}

/*

// <P> or <T> => Generic Type

// pada interface => generic type ditulis SETELAH nama interface
// pada class => generic type ditulis SETELAH nama class
// pada function => generic type ditulis `SEBELUM` nama function

// pada interface
interface List<P> {
    operator fun get(index: Int): P
}

// pada class
class ArrayList<T> : List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}

// pada function
fun <T> List<T>.slice(indices: Iterable<Int>): List<T> {

}

 */