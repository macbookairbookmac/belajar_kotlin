package functional_programming

fun main() {
    val total = (3..15).toList() // 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15

    // slice
    val slice = total.slice(3..6) // menyaring index 3 kebawah sampai 6 keatas

    println(slice) // 6, 7, 8, 9

    // karna slice menggunakan parameter `range`, maka bisa menggunakan `step` juga
    val slice2 = total.slice(3..6 step 2)
    println(slice2) // 6, 8

    // bisa juga menyaring menggunakan `collection` lain

    val index = listOf(2, 3, 5, 8) // `collection` sebagai `index`
    val slice3 = total.slice(index)
    println(slice3)
    println()

    // distinct
    val numbers = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val numberSet = numbers.toSet()

    val distinct = numbers.distinct()

    // memakai distinct
    println(distinct)
    // memakai set
    println(numberSet)
    println()

    val items = listOf(
        Item("1", "Kotlin"),
        Item("5", "Kotlin"),
        Item("2", "Kotlin"),
        Item("10", 50),
        Item("3", "Kotlin"),
        Item("5", "Kotlin"),
        Item("3", "Kotlin"),
        Item("4", "Kotlin"),
        Item("1", "Kotlin"),
        Item("4", "Kotlin"),
    )

    val distinctItems = items
        //.asSequence() // mempercepat proses logika atau perbandingan, jika ada
        .sortedBy { it.key } // sortin berdasarkan `it.key`
        .distinctBy { it.key } // pisah yg mirip berdasarkan `it.key`

    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }
    println()

    val text = listOf("A", "B", "CC", "DD", "EEE", "FFF", "GGGG")
    val distinctText = text.distinctBy { it. length }
    println(distinctText)
    println()

    // chunked
    val word = "QWERTY"
    val chunked = word.chunked(3) // di pisah menjadi per 3 karakter, mirip seperti `split`
    println(chunked)

    val chuckedTransform = word.chunked(3){
        it.toString().lowercase() // don't use toLowerCase, coz deprecated
    }
    println(chuckedTransform)
}

data class Item(val key: String, val value: Any)