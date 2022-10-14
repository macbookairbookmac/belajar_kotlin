package object_oriented_programming

fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 5.0, 2, true)
    println(dicodingCat.getAnimalInfo)
}

val Animal.getAnimalInfo: String
    get() = "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age}, Mamalia: ${this.isMammal}"