package object_oriented_programming

fun main() {
    val doni = Animal(
        "Kucing",
        50.0,
        3,
        true
    )

    println(doni.eat())
    println(doni.sleep())

    println()

    // menggunakan class animal2 yang terdapat get() dan set()

    val dicodingCat = Animal2()
    println("Name: ${dicodingCat.name}")
    dicodingCat.name = "Goose"
    println("Nama: ${dicodingCat.name}")
}

class Animal2{
    var name: String = "Dicoding Miaw"
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
}

class Animal(
    val name: String,
    val weight: Double,
    val age: Int,
    val isMammal: Boolean,
) {
    fun eat(): String {
        return "$name makan !"
    }

    fun sleep(): String {
        return "$name tidur !"
    }
}