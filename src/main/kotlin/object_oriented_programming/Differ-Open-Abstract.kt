package object_oriented_programming

fun main() {
    val childOrang2 = ChildOrang2("", 0, true)
    val orang2 = Orang2("", 0)
    val childOrang = ChildOrang("", 0, true)
    childOrang.eat()
}

class ChildOrang(name: String, age: Int, var isLife: Boolean): Orang(name, age){
    fun longLife(): Int{
        return 10
    }
}

class ChildOrang2(name: String, age: Int, var isLife: Boolean): Orang2(name, age){
    fun longLife(): Int{
        return 10
    }

    override fun eat() {
        super.eat()
    }

    override fun sleep() {
        super.sleep()
    }
}

abstract class Orang(var name: String, var age: Int) { // abstract tidak bisa langsung di pakai di `main()`
    fun eat() {
        println("Makanlah kau $name")
    }

    fun sleep() {
        println("Tidurlah kau $name")
    }
}

open class Orang2(val name: String, val age: Int) { // langsung bisa dipakai di `main()`
    open fun eat() {
        println("Makanlah kau $name")
    }

    open fun sleep() {
        println("Tidurlah kau $name")
    }
}