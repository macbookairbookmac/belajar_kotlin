fun main(){
    val rangeInt = 1..10 step 2
    //val rangeInt = 1.rangeTo(10) step 2 // sama aja
    rangeInt.forEach {
        print("$it ")
    }
    println(rangeInt.step)
}