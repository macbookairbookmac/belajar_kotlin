package control_flow
fun main() {
    val a = 1.rangeTo(10) step 3
    for((i, v) in a.withIndex()){
        println("[$i] = $v")
    }
    println()

    a.forEach {
        println(it)
    }
    println()

    a.forEachIndexed{ i, v ->
        println("[$i] = $v")
    }
}