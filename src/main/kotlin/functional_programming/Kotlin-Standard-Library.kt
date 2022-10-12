package functional_programming

fun main() {

    // lambda receiver (this) => run, with, & apply
    // lambda argument (it) => let & also

    // apply (lambda receiver)
    val buildString = StringBuilder().apply{
        append("Hello ")
        append("Kotlin ")
    }
    println(buildString)
    println()

    // let (lambda argument)
    val text = "Hello"
    text.let{
        val message = "$it Kotlin"
        println(message)
    }

    // run
    val result = text.run{
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println(result)

    // let
    val message: String? = null
    message?.let {
        val length = it.length * 2
        val textt = "text length $length"
        println(textt)
    }

    // let 2
    val lengthh = message?.length ?: (1 * 2)
    val texttt = "text length $lengthh"
    println(texttt)

    // combine let & run
    // guna menjalankan code yang lain jika code sebelumnya bernilai null
    message?.let{
        val length = it.length * 2
        val textt = "text length $length"
        println(textt)
    } ?: run {
        val textt = "message is null"
        println(textt)
    }

    // also
    val resultt = text.also {
        println("value length -> ${it.length}")
    }
    println("text -> $resultt")
}