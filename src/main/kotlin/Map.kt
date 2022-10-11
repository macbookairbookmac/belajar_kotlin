fun main() {

    // jenis collection dengan pattern 'KEY' 'VALUE'
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India",
    )

    // keduanya "sama tapi berbeda"
    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))

    /*
    // Medan tidak ada di map
    println(capital["Medan"]) // null
    println(capital.getValue("Medan")) // bakalan exception
    */

    // capital.put() // tidak bisa melakukan penambahan, karna defaultnya immutable

    val capitalMut = mutableMapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India",
    )

    capitalMut["Paris"] = "French" // bisa melakukan penambahan, karna mutable

}