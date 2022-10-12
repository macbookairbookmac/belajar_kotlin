fun main() {
    10.printInt()
    println(10.plusThree())
    println()
    println(10.slice)

}

// extension property
val Int.slice: Int
    get() = this / 2

// extension function
fun Int.printInt() {
    println("val $this")
}

fun Int.plusThree(): Int {
    return this.plus(3)
}

/*
class NewInt: Int(){ // karna Int() itu sudah final, maka tidak bisa mewariskan ke class lain, asal mula tercipta extension
    fun printInt(){
        println("value $this")
    }
}
*/
