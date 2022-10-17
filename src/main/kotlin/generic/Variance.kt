package generic

fun main() {

    // variance -> membuat 2 subtype dari vehicle yaitu car dan motorcycle
    val car = Car(200)
    val motorCycle = MotorCycle(100)
    var vehicle : Vehicle = car
    vehicle = motorCycle

    val carList = listOf(Car(100), Car(120))
    val vehicleList = carList
}

abstract class Vehicle(wheel: Int)
class Car(speed: Int) : Vehicle(4)
class MotorCycle(speed: Int) : Vehicle(2)

// covariant => hanya bisa dibuat sebagai return type
// tidak bisa dibuat sebagai parameter atau argumen
interface List<out E> : Collection<E>{
    operator fun get(index: Int) : E // out == luar
}

// contravariant => hanya bisa dibuat sebagai parameter atau argumen
// tidak bisa dibuat sebagai return type
interface Comparable<in T> {
    operator fun compareTo(other: T) : Int // in == dalam
}