fun main() {
    val a = Unit
    //println(a)
    val listGenap  = Array(10) {
            i -> i * 2
    }

    /*for (genap in listGenap){
        println(genap)
    }*/

    print("Office ${if (listGenap.size > 7) "Already close" else "is open"}")

    println("\n")

    var x = 1
    do{
        println("do while")
        x++
    }while (x == 1)

    var y = 1
    while (y == 1){
        println("while")
        y++
    }
}
