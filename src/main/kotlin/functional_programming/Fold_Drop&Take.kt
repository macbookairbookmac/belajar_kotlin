package functional_programming

fun main() {
    val numbers = (1..3).toList()
    val number2 = (1..6).toList()

    // fold -> melakukan iterasi dan perhitungan sekaligus
    // current -> nilai yang di fold
    // item -> nilai pada list
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    println(fold)
    println()
    println("=================")
    println()

    // fold right -> melakukan iterasi dan perhitungan sekaligus, bedanya dari atas adalah dimulai dari bawah
    // current -> nilai yang di fold
    // item -> nilai pada list
    val foldRight = numbers.foldRight(10){ item, current ->
        println("item $item")
        println("current $current")
        println()
        item + current
    }

    println(foldRight)

    println()
    println("=================")
    println()


    // Drop

    val drop = number2.drop(3) // pangkas 3 item dari awal -> [4, 5, 6]
    println(drop)

    // Droplast
    val dropLast = number2.dropLast(3) // pangkas 3 item dari akhir -> [1, 2, 3]
    println(dropLast)

    println()
    println("=================")
    println()


    // Take -> mirip dengan droplast :D

    val take = number2.take(3) // menyaring 3 item dari awal -> [1, 2, 3]
    println(take)

    // Takelast -> mirip dengan drop
    val takeLast = number2.takeLast(3) // menyaring 3 item dari akhir -> [4, 5, 6]
    println(takeLast)

}