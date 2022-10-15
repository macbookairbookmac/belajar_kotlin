package object_oriented_programming

import kotlin.reflect.KProperty

fun main() {
    val animal = Animal3()
    animal.name = "Dicoding Miaw"
    println("Nama Hewan: ${animal.name}")
    println()

    val person = Person()
    person.name = "Dimas"
    println("Nama Orang: ${person.name}")
    println()

    val hero = Hero()
    hero.name = "Gatotkaca"
    println("Nama Pahlawan: ${hero.name}")
    println()
    println("================================")
    println()

    val animal4 = Animal4()
    animal4.name = "Dicoding cat"
    animal4.weight = 6.2
    animal4.age = 1

    println()
    println("Nama: ${animal4.name}")
    println()
    println("Weight: ${animal4.weight}")
    println()
    println("Age: ${animal4.age} Tahun")
    println()

}

class Animal3 {
    var name: String by DelegateName()
}

class Person {
    var name: String by DelegateName()
}

class Hero {
    var name: String by DelegateName()
}

class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>): String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String) {
        println("Fungsi ini sama seperti setter untuk property ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berbah menjadi $newValue")
        value = newValue
    }

}

class Animal4 {
    var name: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}

class DelegateGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk property ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}