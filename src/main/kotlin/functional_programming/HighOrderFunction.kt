package functional_programming

fun main() {

    printResult(10, sum) // 10 + 10 = 20

    printResult(10){
        it * 5
    } // 10 * 5 = 50

    printResult(10, multiply5) // 10 * 5 = 50
}

fun printResult(value: Int, sum: (Int) -> Int){
    val result = sum(value)
    println(result)
}

val multiply5:(Int) -> Int = {
    it * 5
}

var sum :(Int) -> Int = { value ->
    value + value
} // contoh lambda yang memiliki 1 parameter dengan type kembalian Int

