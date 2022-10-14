package functional_programming

fun main() {
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber)
    println(evenNumbers)

    val _evenNumbers = numbers.filter(Int::_isEvenNumber)
    println(_evenNumbers)

    println(::_message.name)
    println(::_message.get())

    ::_message.set("Kotlin Academy")

    println(::_message.get())
}

// jika var -> KMutableProperty (set, get, name's property)
// jika val -> KProperty (get, name's property)
var _message = "Kotlin"

fun Int._isEvenNumber() = this % 2 == 0

fun isEvenNumber(number: Int) = number % 2 == 0

val _sum: (Int, Int) -> Int = { valueA, valueB -> valueA + valueB} // function type
/*      Sama saja dengan    */
val sum_: (Int, Int) -> Int = ::count // penggantian `{ valueA, valueB -> valueA + valueB}` => ::count
fun count(valueA: Int, valueB: Int): Int { // pemecahan dari function type menjadi sebuah function biasa
    return valueA + valueB
}
// dinamakan teknik Reflection
// seperangkat fitur bahasa dan library yang memungkinkan kita untuk mengamati struktur kode dari proyek yang ...
// ... sedang kita kerjakan secara langsung,