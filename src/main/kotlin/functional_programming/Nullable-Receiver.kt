fun main() {
    println(null.slice)
    println(9.slice) // nilainya 4 karna int bukan decimal
    println(13f.slice2)
}

val Int?.slice: Int
    get() = this?.div(2) ?: 0

val Float?.slice2: Float
    get() = this?.div(7) ?: 0F