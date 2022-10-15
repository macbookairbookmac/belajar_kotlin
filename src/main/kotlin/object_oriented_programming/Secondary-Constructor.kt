package object_oriented_programming

fun main() {
    val dicodingCat = Animal6("Dicoding Miaw", -0.2, -2, true)
    println("Name: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, Mamalia: ${dicodingCat.isMammal}")

    val dicodingBird = Animal6("Dicoding Miaw", 0.5, 1)
    println("Name: ${dicodingBird.name}, Berat: ${dicodingBird.weight}, Umur: ${dicodingBird.age}, Mamalia: ${dicodingBird.isMammal}")
}


internal class Animal6(pName: String, pWeight: Double, pAge: Int){
    val name: String
    val weight: Double
    val age: Int
    var isMammal: Boolean

    init {
        weight = if(pWeight < 0) 0.1 else pWeight
        age = if(pAge < 0) 0 else pAge
        name = pName
        isMammal = false
    }

    constructor(pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean) : this(pName, pWeight, pAge){
        isMammal = pIsMammal
    }
}