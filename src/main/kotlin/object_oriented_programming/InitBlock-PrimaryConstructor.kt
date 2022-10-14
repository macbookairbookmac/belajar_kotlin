package object_oriented_programming

fun main() {
    val dicodingCat = Animal5("Dicoding Miaw", 0.0, -2, true)
    println("Name: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, Mamalia: ${dicodingCat.isMammal}")
}

class Animal5(pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean){
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        weight = if(pWeight > 0) 0.1 else pWeight
        age = if(pAge < 0) 0 else pAge
        name = pName
        isMammal = pIsMammal
    }
}