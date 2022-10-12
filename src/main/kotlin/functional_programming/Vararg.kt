package functional_programming

fun main() {
    // vararg dapat membuat kita menginput banyak dengan 1 parameter saja
    val number = sumNumber(25, 20, 30)
    println("vararg sum number : $number")
    println()
    val listNumber = asList(25, 20, 30)
    println(listNumber)

    // sesuai peraturan
    println(sets1("Jonry", 25, 25, 25))
    // dengan argument, jika tidak, maka compiler akan menetapkan itu sebagai vararg
    println(sets2(25, 25, 25, name = "Jonry"))

    // menginput ARRAY kedalam VARARG param dengan SPREAD OPERATOR (*)
    val number2 = intArrayOf(10, 20, 30, 40, 50)
    println(sets1("Jonry", 10, 20, *number2))
}

fun sumNumber(vararg number: Int): Int {
    return number.sum()
}

fun <T> cth(easy: T): T {
    return easy
}

fun <T> asList(vararg input: T): List<T> {
    val result = ArrayList<T>()
    input.forEach {
        result.add(it)
    }
    return result
}

// peraturannya, bila memiliki function yang tidak hanya vararg saja...
// sebaiknya parameter vararg diletakkan diakhir
fun sets1(name: String, vararg number: Int): String {
    return name
}

// jika ingin meletakkan vararg di awal, pemanggilan harus menggunakan parameter
fun sets2(vararg number: Int, name: String): String {
    return name
}


/* tidak diizinkan 2 type vararg dalam 1 function */
// fun sumNum(vararg num: Int, vararg num2: Int) // Multiple vararg-parameters are prohibited

