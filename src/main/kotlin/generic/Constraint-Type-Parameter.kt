package generic

fun main() {

}

/*

// constraint type ditulis untuk `memaksa` generic type supaya membuat type data sesuai yang kita inginkan
// contohnya Number di bagian <T: Number>

// dan ketika memanggil class tersebut dengan TIDAK MEMBUAT TYPE NUMBER (Long, Int, etc)
// maka akan error : ``TYPE ARGUMENT IS NOT WITHIN ITS BOUNDS``

// dan juga bisa diterapkan pada function


// pada class
class ListNumber<T: Number> : List<T>{
    override fun get(index: Int): T {

    }
}

// pada function
fun <T: Number> List<T>.sumNumber() : T {

}

 */