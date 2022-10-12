package functional_programming

fun main() {
    println(buildStringKw()) // without DSL
    println()

    val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda ")
        append("DSL")
    }
    println(message) // using DSL
    println()

    /*
    val message2 = buildString(buildString2())
    println(message2)
    */
}

typealias bS2 = StringBuilder.() -> Unit
/*

fun buildString2(): StringBuilder.() -> Unit {
    return bS2.
        */
/*.append("Hello ")
        .append("from ")
        .append("lambda ")
        .append("DSL")*//*

}
*/

fun buildStringKw(): String {
    val stringBuilder = StringBuilder()
        .append("Hello ")
        .append("from ")
        .append("lambda")
    return stringBuilder.toString()
} // without DSL (Domain Specific Language)

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
} // with DSL