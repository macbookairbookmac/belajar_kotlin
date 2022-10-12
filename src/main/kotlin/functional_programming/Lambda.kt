package functional_programming

fun main() {

    // lambda biasa disebut anonymous function

    message() // memanggil lambda function
    printMessage("Hello from lambda versi 2")
    val length = messageLength("Hello from lambda versi return nilai")
    println("Message length : $length")
}

val comparator = Runnable {

} // contoh lambda

val message = {
    println("Hello from lambda versi 1")
}

val printMessage = { msg: String ->
    println(msg)
}

val messageLength = { msg: String ->
    msg.length
}
