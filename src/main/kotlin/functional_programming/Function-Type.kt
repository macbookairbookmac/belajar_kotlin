fun main() {
    val sum: Arithmetic = { val1, val2 ->
        val1.plus(val2)
    }

    val sumSafe: Arithmetic2 = { val1, val2 ->
        val1.plus(val2)
    }

    val multiply: Arithmetic = { val1, val2 ->
        val1.times(val2)
    }

    val sumResult = sum.invoke(10, 10) // memanggilnya dengan menggunakan operator `invoke()`
    val multiplyResult = multiply(10, 10) // ataupun tanpa invoke()

    val sumSafeResult = sumSafe?.invoke(10, 3)

    println(sumResult)
    println(multiplyResult)
    println()
    println(sumSafeResult)
}

// (Int, Int) -> Int asal mula dari function type
typealias Arithmetic = (Int, Int) -> Int // agar dapat di pakai, jadinya menggunakan `typealias`
typealias Arithmetic2 = ((Int, Int) -> Int)? // bisa juga pake safe call diakhir