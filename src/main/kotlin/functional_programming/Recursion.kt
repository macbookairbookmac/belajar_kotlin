package functional_programming

fun main() {
    println(factorial1(5)) // 120 ( 5 * 4 * 3 * 2 * 1 )
    println()
    println(factorial1(65)) // batas max penggunaan `long` pada function ini hanya 65
    println(10.factorial1Lima())
    println(factorial2(65))
    println(factorial3(65))
}

fun factorial1 (n: Long): Long{
    return if (n.toInt() == 1){
        n
    }else{
        var result: Long = 1
        for (i in 1..n){
            result *= i
        }
        result
    }
}

fun Int.factorial1Lima(): Int{
    return if (this == 1){
        this
    }else{
        var result = 1
        for (i in 1..this){
            result *= i
        }
        result
    }
}

fun factorial2(n: Long): Long{
    return if (n == (1).toLong()){
        n
    }else{
        n * factorial2(n - 1 )
    }
}

// tail call recursion -> subroutine => sekumpulan urutan instruksi untuk menjalankan tugas tertentu
tailrec fun factorial3(n: Long, result: Long = 1): Long { // tambahan modifier `tailrec`, guna menghindari penumpulan frame
    // secara default JVM tidak mendukung optimasi `tail recursion`
    // catatam penggunaan `tailrec`
    // hanya boleh dipanggil untuk dijalankan terakhir dan tidak boleh digunakan dari dalam blok `try-catch-finally `
    val newResult = n * result
    return if (n == (1).toLong()){
        newResult
    }else{
        factorial3(n - 1, newResult)
    }
}
// SAYANGNYA PADA CASE INI, PENGGUNAAN `tailrec` TIDAK MAKSIMAL
// DIKARENAKAN TIDAK ADA ERROR `stackoverflow` MESKIPUN TANPA PENGGUNAAN MODIFIER `tailrec`